package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("test@test.com", "Ivanov Ivan");
        map.put("test2@test.com", "Antonov Anton");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
