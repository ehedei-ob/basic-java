package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author {@link "mailto:ehedeidev@gmail.com"}
 */
public class Menu {

    private Map<String, Runnable> commands;
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.commands = new HashMap<>();
        commands.put("1", this::copyFile);
        commands.put("2", this::deleteFiles);
    }


    public void run() {
        String option = "";

        do {
            System.out.println("\n##### Menu #####");
            System.out.println("1. Copiar un archivo");
            System.out.println("2. Eliminar una lista de archivos");
            System.out.println("Seleccione una opción [Enter para salir]: ");
            getScanner().reset();
            option = getScanner().nextLine().trim();

            if (option.isEmpty()) {
                System.out.println("Ha seleccionado abandonar el programa. ¡Hasta la vista!");
            } else if (getCommands().containsKey(option)) {
                getCommands().get(option).run();
            } else {
                System.out.printf("'%s' no es una opción válida. Por favor, inténtelo de nuevo%\n", option);
            }

        } while (!option.isEmpty());

        getScanner().close();
        System.out.println("Programa finalizado");
    }

    private void deleteFiles() {
        final ArrayList<String> files = new ArrayList<>();
        getScanner().reset();

        String filePath = "";
        do {
            System.out.println("Introduzca la ruta del archivo que desea borrar [Enter para finalizar la lista]: ");
            filePath = scanner.nextLine().trim();
            files.add(filePath);
        } while (!filePath.isEmpty());

        files.forEach(this::deleteFile);
    }

    private void deleteFile(final String filePath) {
        try {
            Files.delete(Path.of(filePath));
            System.out.printf("Archivo '%s' borrado correctamente\n", filePath);
        } catch (NoSuchFileException e) {
            System.out.printf("No se ha podido borrar el archivo '%s': El archivo no existe\n", filePath);
        } catch (DirectoryNotEmptyException e) {
            System.out.printf("No se ha podido borrar la carpeta '%s': La carpeta no está vacía\n", filePath);
        } catch (SecurityException e) {
            System.out.printf("No se ha podido borrar el archivo '%s': No se tienen permisos suficientes\n", filePath);
        } catch (IOException e) {
            System.out.printf("No se ha podido borrar el archivo '%s'\n", filePath);
        }
    }

    private void copyFile() {
        getScanner().reset();
        System.out.println("Inserte la ruta del archivo a copiar: ");
        final String fileIn = getScanner().nextLine().trim();
        System.out.println("Inserte la ruta de destino de la copia: ");
        final String fileOut = getScanner().nextLine().trim();

        try {
            Main.copyFile(fileIn, fileOut);
            System.out.printf("Archivo '%s' copiado en '%s'\n", fileIn, fileOut);
        } catch (IOException e) {
            System.out.println("No se ha podido realizar la operación");
        }
    }

    public Map<String, Runnable> getCommands() {
        return commands;
    }

    public void setCommands(final Map<String, Runnable> commands) {
        this.commands = commands;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(final Scanner scanner) {
        this.scanner = scanner;
    }
}
