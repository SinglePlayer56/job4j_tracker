package ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapLambdaUsage {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "name");
        map.put(2, "top");
        map.put(3, "user");
        map.put(4, "precision");
        map.put(5, "post");
        BiFunction<Integer, String, String> function = (key, value) -> value + "_" + key;
        BiFunction<Integer, String, String> function2 = (key, value) -> value + "___" + key;
        map.replaceAll(function);
        String result = map.computeIfPresent(1, function2);
        System.out.println("Current value: " + result);
        Function<Integer, String> function3 = String::valueOf;
        map.computeIfAbsent(7, function3);
        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Shoes", 200);
        BiFunction<Integer, Integer, Integer> function1 = (oldValue, newValue) -> oldValue - newValue;
        int newPrice = map2.merge("Shoes", 50, function1);
        System.out.println(newPrice);
        System.out.println("Price of shirt: " + map2.merge("Shirt", 100, function1));
        map2.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
    }
}
