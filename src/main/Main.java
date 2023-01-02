package main;

import main.repositories.CocheCRUD;
import main.repositories.impl.CocheCRUDImpl;

/**
 * @author {@link "mailto:ehedeidev@gmail.com"}
 */
public class Main {
    public static void main(String[] args) {
        final CocheCRUD cocheCRUD = new CocheCRUDImpl();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}