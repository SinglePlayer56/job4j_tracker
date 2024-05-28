package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int sizeResultArray = 0;
        Item[] result = new Item[size];
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                result[i] = item;
                sizeResultArray++;
            }
        }
        return Arrays.copyOf(result, sizeResultArray);
    }

    public Item findById(int id) {
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }
}