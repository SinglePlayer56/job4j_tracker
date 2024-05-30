package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Взлетает");
    }

    @Override
    public void stops() {
        System.out.println("Садится");
    }
}
