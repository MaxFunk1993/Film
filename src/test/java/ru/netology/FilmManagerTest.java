package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    @Test
    public void test() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Kino 1");
        manager.addMovie("Kino 2");
        manager.addMovie("Kino 3");

        String[] expected = {"Kino 1", "Kino 2", "Kino 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        FilmManager manager = new FilmManager();

        manager.addMovie("Kino 1");
        manager.addMovie("Kino 2");
        manager.addMovie("Kino 3");

        String[] expected = {"Kino 3", "Kino 2", "Kino 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void more() {

        FilmManager manager = new FilmManager();
        FilmManager manager2 = new FilmManager(6);

        manager2.addMovie("Kino 1");
        manager2.addMovie("Kino 2");
        manager2.addMovie("Kino 3");
        manager2.addMovie("Kino 4");
        manager2.addMovie("Kino 5");
        manager2.addMovie("Kino 6");
        manager2.addMovie("Kino 7");

        String[] expected = {"Kino 7", "Kino 6", "Kino 5", "Kino 4", "Kino 3", "Kino 2"};
        String[] actual = manager2.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void equally() {

        FilmManager manager = new FilmManager();
        FilmManager manager2 = new FilmManager();

        manager.addMovie("Kino 1");
        manager.addMovie("Kino 2");
        manager.addMovie("Kino 3");
        manager.addMovie("Kino 4");
        manager.addMovie("Kino 5");


        String[] expected = {"Kino 5", "Kino 4", "Kino 3", "Kino 2", "Kino 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void Less() {

        FilmManager manager = new FilmManager();
        FilmManager manager2 = new FilmManager(3);

        manager2.addMovie("Kino 1");
        manager2.addMovie("Kino 2");
        manager2.addMovie("Kino 3");
        manager2.addMovie("Kino 4");

        String[] expected = {"Kino 4", "Kino 3", "Kino 2"};
        String[] actual = manager2.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
