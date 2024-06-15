package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса
 * @author Viktor Korchagin
 * @version 1.0
 */
public class BankService {
    /**
     * Пользователей банка храним в мапе типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Методя для добавления пользователя
     * Добоавляет пользователя, только в случае, если его ещё нету среди других
     * пользователей банка
     * @param user принимает пользователя
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Методя для удаления пользователя
     * @param passport номер пасспорта пользователя
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод позволяет добавить новый банковский счёт для пользователя
     * если счёт уже существует у пользователя, то ничего не добавляется
     * @param passport номер пасспорта пользователя
     * @param account новый счёт
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод позволяет найти пользователя по номеру пасспорта
     * @param passport номер пасспорта
     * @return возвращает найденной пользователя или null, если пользователь не найден
     */
    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                return key;
            }
        }
        return null;
    }

    /**
     * Метод позволяет найти банковский счёт
     * @param passport номер пасспорта пользователя
     * @param requisite реквизиты счёта
     * @return возвращает найденный счёт или null, если счёт не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод позволяет перевести деньги с одного банковского счёт на другой
     * @param sourcePassport номер пасспорта отправителя
     * @param sourceRequisite реквизиты счёта отправителя
     * @param destinationPassport номер пасспорта получателя
     * @param destinationRequisite реквизиты счёта получателя
     * @param amount количество денежных средств для перевода
     * @return возвращает true в случае успешного перевода, в противном случае false
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount == null
                || destinationAccount == null
                || sourceAccount.getBalance() < amount
        ) {
            return false;
        }
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        destinationAccount.setBalance(destinationAccount.getBalance() + amount);
        return true;
    }

    /**
     * Метод позволяет получить все банковские счета конкретного пользователя
     * @param user пользователь
     * @return возвращает список счетов
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}