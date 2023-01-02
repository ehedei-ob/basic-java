package main.repositories.impl;

import main.repositories.CocheCRUD;

/**
 * @author {@link "mailto:ehedeidev@gmail.com"}
 */
public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("Save");
    }

    @Override
    public void findAll() {
        System.out.println("Find all");
    }

    @Override
    public void delete() {
        System.out.println("Delete");
    }
}
