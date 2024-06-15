package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает сущность пользователя
 * @author Viktor Korchagin
 * @version 1.0
 */
public class User {
    /**
     * Номер пасспорта хранится в переменной типа String
     */
    private String passport;
    /**
     * Имя пользователя хранится в переменной типа String
     */
    private String username;

    /**
     * Конструктор с двумя параметрами
     * @param passport номер паспорта
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод для получения номера пасспорта пользователя
     * @return возвращает номер пасспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод записывает номер паспорта
     * @param passport номер пасспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод для получения имени пользователя
     * @return возвращает имя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод записывает имя пользователя
     * @param username имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}