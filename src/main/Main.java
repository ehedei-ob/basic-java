package main;

/**
 * @author {@link "mailto:ehernandez@eturia.es"}
 */
public class Main {

    private static String concat(final String[] array) {
        return concat(array, " ");
    }

    private static String concat(final String[] array, final String separator) {
        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);

            if(i + 1 != array.length) {
                stringBuilder.append(separator);
            }
        }

        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        final String[] names = {"Juan", "Periquito", "Andrés", "Pedro"};
        final String stringNames = concat(names, ", ");
        System.out.println(stringNames);

        final String stringNamesWithSpace = concat(names);
        System.out.println(stringNamesWithSpace);
    }
}