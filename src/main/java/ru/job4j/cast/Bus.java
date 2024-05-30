package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Едет");
    }

    @Override
    public void stops() {
        System.out.println("Тормозит");
    }
}
