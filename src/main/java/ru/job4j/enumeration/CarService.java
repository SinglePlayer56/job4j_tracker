package ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo);
        Status[] statuses = Status.values();
        for (Status s: statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }
        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        System.out.println(status);
        switch (status) {
            case ACCEPTED -> System.out.println("Статус: Автомобиль принят на СТО");
            case IN_WORK -> System.out.println("Статус: Автомобиль в работе");
            case WAITING -> System.out.println("Статус: Автомобиль ожидает запчасти");
            case FINISHED -> System.out.println("Статус: Все работы завершены");
            default -> {
            }
        }
    }
}
