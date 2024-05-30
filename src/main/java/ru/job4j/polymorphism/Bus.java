package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус начал движение.");
    }

    @Override
    public void passengers(int count) {
        if (count == 0) {
            System.out.println("Автобус пуст.");
        } else {
            System.out.println("Пассажиров в автобусе: " + count);
        }
    }

    @Override
    public double refill(int fuel) {
        return fuel * 53.47;
    }
}
