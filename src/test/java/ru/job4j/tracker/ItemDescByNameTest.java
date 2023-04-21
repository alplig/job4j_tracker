package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ItemDescByNameTest {
    @Test
    public void whenItemsDescByName() {
        List<Item> items = Arrays.asList(
                new Item("c"),
                new Item("b"),
                new Item("a"),
                new Item("e"),
                new Item("d")
        );
        List<Item> expected = List.of(
                new Item("e"),
                new Item("d"),
                new Item("c"),
                new Item("b"),
                new Item("a")
        );
        items.sort(new ItemDescByName());
        assertThat(items.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void whenSortedItemsDescByName() {
        List<Item> items = Arrays.asList(
                new Item("e"),
                new Item("d"),
                new Item("c"),
                new Item("b"),
                new Item("a")
        );
        List<Item> expected = List.of(
                new Item("e"),
                new Item("d"),
                new Item("c"),
                new Item("b"),
                new Item("a")
        );
        items.sort(new ItemDescByName());
        assertThat(items.toString()).isEqualTo(expected.toString());
    }
}