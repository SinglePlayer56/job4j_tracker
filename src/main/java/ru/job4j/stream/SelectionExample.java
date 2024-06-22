package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class SelectionExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Один", "Два", "Три", "Четыре", "Пять");
        List<String> result = strings
                .stream()
                .skip(2)
                .limit(2)
                .toList();
        String firstString = strings
                .stream()
                .skip(2)
                .limit(2)
                .findFirst()
                .orElse("По умолчанию");
        String defaultString = strings
                .stream()
                .skip(5)
                .findFirst()
                .orElse("По умолчанию");
        String lastString = strings
                .stream()
                .skip(strings.size() - 1)
                .findFirst()
                .orElse("По умолчанию");
        System.out.println(result);
        System.out.println(firstString);
        System.out.println(defaultString);
        System.out.println(lastString);
    }
}
