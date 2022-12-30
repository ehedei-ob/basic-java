package main;

/**
 * @author {@link "mailto:ehedeidev@gmail.com"}
 */
public class Main {
    private static final double GENERAL_IVA = 21;
    public static double getPriceWithIva(final double price) {
        final double percentage = price / 100 * GENERAL_IVA;
        return price + percentage;
    }
    public static void main(String[] args) {
        final double price = 125.50;

        System.out.println("Precio del producto: " + price);
        System.out.println("Precio con IVA: " + getPriceWithIva(price));
    }
}