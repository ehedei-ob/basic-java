package main;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author {@link "mailto:ehernandez@eturia.es"}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("##### Booleans #####\n");
        final boolean bool = true;
        System.out.println("Boolean: " + bool);

        System.out.println("\n\n##### Números enteros #####\n");

        final byte byteNum = Byte.MAX_VALUE;
        System.out.println("Byte: " + byteNum);

        final short shortNum = Short.MAX_VALUE;
        System.out.println("Short: " + shortNum);

        final int integer = Integer.MAX_VALUE;
        System.out.println("Integer: " + integer);

        final long longNum = Long.MAX_VALUE;
        System.out.println("Long: " + longNum);

        final BigInteger bigInteger = BigInteger.ONE;
        System.out.println("BigInteger: " + bigInteger);

        System.out.println("\n\n##### Números de coma flotante #####\n");
        final float floatNum = Float.MIN_VALUE;
        System.out.println("Float: " + floatNum);

        final double doubleNum = Double.MIN_VALUE;
        System.out.println("Double: " + doubleNum);

        final BigDecimal bigDecimal = BigDecimal.valueOf(Math.PI);
        System.out.println("BigDecimal: " + bigDecimal);


        System.out.println("\n\n##### Carácter #####\n");
        final char character = 'J';
        System.out.println("Char: " + character);

        System.out.println("\n\n##### Cadena de caracteres #####\n");
        final String string = "Mi mamá me mima";
        System.out.println("String: " + string);

    }
}