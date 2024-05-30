package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car;
        Object object = car;
        Object objectCar = new Car();
        Car carFromObject = (Car) objectCar;
        /* Ошибка в приведении типа. */
        /*
         * Object bicycle = new Bicycle();
         * Car carBicycle = (Car) bicycle; // код завершится с ошибкой приведения типов ClassCastException
        */

    }
}
