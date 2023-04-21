package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemAscByNameTest {
    @Test
    public void whenItemsAscByName() {
        List<Item> items = Arrays.asList(
                new Item("c"),
                new Item("b"),
                new Item("a"),
                new Item("e"),
                new Item("d")
        );
        List<Item> expected = List.of(
                new Item("a"),
                new Item("b"),
                new Item("c"),
                new Item("d"),
                new Item("e")
        );
        items.sort(new ItemAscByName());
        assertThat(items.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void whenSortedItemsAscByName() {
        List<Item> items = Arrays.asList(
                new Item("a"),
                new Item("b"),
                new Item("c"),
                new Item("d"),
                new Item("e")
        );
        List<Item> expected = List.of(
                new Item("a"),
                new Item("b"),
                new Item("c"),
                new Item("d"),
                new Item("e")
        );
        items.sort(new ItemAscByName());
        assertThat(items.toString()).isEqualTo(expected.toString());
    }
}