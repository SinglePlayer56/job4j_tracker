package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает сущность банковский счёт
 *
 * @author Viktor Korchagin
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты счёта хранятся в переменной типа String
     */
    private String requisite;
    /**
     * Баланс на счёте хранится в переменной типа double
     */
    private double balance;

    /**
     * Конструктор
     * @param requisite реквизиты счёта
     * @param balance начальный баланс на счёту
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод для получения реквизитов
     * @return возвращает реквизиты
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод для записи реквизитов счёта
     * @param requisite реквизиты счёта
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод для получения остаточного баланса на счёте
     * @return возвращает баланс на счёте
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод для установки остаточного баланса на счёте
     * @param balance новый баланс
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Account account = (Account) object;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
