package ru.job4j.tracker.comparator;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {
    @Test
    public void whenItemsAscSort() {
        List<Item> items = Arrays.asList(
                new Item(1, "Купить продукты"),
                new Item(2, "Сходить погулять"),
                new Item(3, "Вынести мусор"),
                new Item(4, "Поучить Java")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(3, "Вынести мусор"),
                new Item(1, "Купить продукты"),
                new Item(4, "Поучить Java"),
                new Item(2, "Сходить погулять")
        );
        assertThat(items.toString()).isEqualTo(expected.toString());
    }
}