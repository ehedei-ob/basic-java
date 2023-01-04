package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;

/**
 * @author {@link "mailto:ehernandez@eturia.es"}
 */
public class Main {
    public static String reverse(String texto) {
        final StringBuilder sb = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            sb.append(texto.charAt(i));
        }

        return sb.toString();
    }

    private static String vectorToString(final Vector<Integer> vector) {
        return vector.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]"));
    }

    private static void dividePorCero() throws ArithmeticException {
        throw new ArithmeticException("Esto no puede hacerse");
    }

    public static boolean copyFile(final String fileIn, final String fileOut) throws IOException {
        boolean success = true;

        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        PrintStream printStream = null;

        try {
            inputStream = new FileInputStream(fileIn);
            outputStream = new FileOutputStream(fileOut);

            bufferedInputStream = new BufferedInputStream(inputStream);
            printStream = new PrintStream(outputStream, true);


            while (bufferedInputStream.available() > 0) {
                printStream.write(bufferedInputStream.read());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
            success = false;
        } catch (IOException e) {
            System.out.println("Error en la carga del fichero: " + e.getMessage());
            success = false;
        } finally {
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }

            if (inputStream != null) {
                inputStream.close();
            }

            if (printStream != null) {
                printStream.close();
            }

            if (outputStream != null) {
                outputStream.close();
            }
        }

        return success;
    }


    public static void main(String[] args) {


        System.out.println("1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.");
        final String[] words = new String[]{"Batido", "Coche", "Ratón", "Huevo"};
        for (final String word : words) {
            System.out.println(word);
        }

        System.out.println("\n2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.");
        final int[][] biArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray[i].length; j++) {
                System.out.println("Posición [" + i + ", " + j + "] = " + biArray[i][j]);
            }

        }

        System.out.println("\n3. Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.");

        final Vector<Integer> vector = new Vector<>(5);

        for (int i = 0; i < 5; i++) {
            vector.add(i);
        }

        System.out.println("Valores del Vector: " + vectorToString(vector));

        for (int i = vector.size() - 1; i <= 0; i--) {
            if (i == 3 || i == 2) {
                vector.remove(i);
            }
        }

        System.out.println("Valores del Vector tras eliminar el segundo y el tercer elemento: " + vectorToString(vector));

        System.out.println("\n4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.");
        System.out.println("Cada vez que el Vector alcance su capacidad, el Vector, internamente, deberá hacer una copia de si mismo con el doble de capacidad, lo que puede suponer una gran pérdida de performance");

        System.out.println("\n5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.");

        final ArrayList<String> arrayList = new ArrayList<>(4);
        for (int i = 1; i <= 4; i++) {
            arrayList.add("Elemento número " + i);
        }

        final LinkedList<String> linkedList = new LinkedList<>(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("LinkedList [" + i + "]: " + linkedList.get(i));
            System.out.println("ArrayList [" + i + "]: " + arrayList.get(i));
        }

        final ArrayList<Integer> integers = new ArrayList<>(10);
        System.out.println("\n6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer \"for\" de relleno.");
        for (int i = 1; i < 10; i++) {
            integers.add(i);
        }

        System.out.println("Lista filtrada: " + integers.stream()
                .filter(num -> num % 2 != 0)
                .map(String::valueOf)
                .collect(Collectors.joining(", ", "[", "]")));

        System.out.println("\n7. Crea una función DividePorCero. Esta, debe generar una excepción (\"throws\") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde \"main\", por ejemplo). Si se dispara la excepción, mostraremos el mensaje \"Esto no puede hacerse\". Finalmente, mostraremos en cualquier caso: \"Demo de código\".");
        try {
            dividePorCero();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }

        System.out.println("\n8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: \"fileIn\" y \"fileOut\". La tarea de la función será realizar la copia del fichero dado en el parámetro \"fileIn\" al fichero dado en \"fileOut\".");
        System.out.println("\n9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.");
        new Menu().run();
    }
}