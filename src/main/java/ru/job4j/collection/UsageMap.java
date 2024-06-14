package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("test@test.com", "Ivanov Ivan");
        map.put("test2@test.com", "Antonov Anton");
        map.put("test@test.com", "Semenov Egor");
        map.put("test45@test.com", "Osipov Anton");
        map.put("test129@test.com", "Maksimov Maksim");
        map.put("test11@test.com", "Testov Test");
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
