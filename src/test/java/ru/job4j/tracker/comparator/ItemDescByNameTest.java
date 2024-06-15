package ru.job4j.tracker.comparator;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {
    @Test
    public void whenItemsDescSort() {
        List<Item> items = Arrays.asList(
                new Item(1, "Купить продукты"),
                new Item(2, "Сходить погулять"),
                new Item(3, "Вынести мусор"),
                new Item(4, "Поучить Java")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(2, "Сходить погулять"),
                new Item(4, "Поучить Java"),
                new Item(1, "Купить продукты"),
                new Item(3, "Вынести мусор")
        );
        assertThat(items).isEqualTo(expected);
    }
}