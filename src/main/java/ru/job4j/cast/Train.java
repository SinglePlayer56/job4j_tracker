package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Двигается по путям");
    }

    @Override
    public void stops() {
        System.out.println("Сбрасывает скорость для торможения");
    }
}
