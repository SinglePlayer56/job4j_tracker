package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Состояние: " + this.active);
        System.out.println("Код ошибки: " + this.status);
        System.out.println("Сообщение: " + this.message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error404 = new Error(true, 404, "Данные не найдены");
        Error error502 = new Error(true, 502, "Сервер не доступен");
        Error error401 = new Error(false, 401, "Пользователь не авторизован");
        error.printInfo();
        error404.printInfo();
        error502.printInfo();
        error401.printInfo();
    }
}
