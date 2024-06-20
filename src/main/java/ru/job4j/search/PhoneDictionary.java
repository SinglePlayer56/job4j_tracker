package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> predicateName = obj -> obj.getName().contains(key);
        Predicate<Person> predicateAddress = obj -> obj.getAddress().contains(key);
        Predicate<Person> predicatePhone = obj -> obj.getPhone().contains(key);
        Predicate<Person> combine = predicateName.or(predicateAddress.or(predicatePhone));
        ArrayList<Person> results = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                results.add(person);
            }
        }
        return results;
    }
}
