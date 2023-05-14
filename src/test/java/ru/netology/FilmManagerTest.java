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
}