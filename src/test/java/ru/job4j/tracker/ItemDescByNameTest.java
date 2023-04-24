package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.ListAssert.assertThatList;

class ItemDescByNameTest {
    @Test
    public void whenItemsDescByName() {
        List<Item> actual = Arrays.asList(
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
        actual.sort(new ItemDescByName());
        assertThatList(actual).isEqualTo(expected);
    }

    @Test
    public void whenSortedItemsDescByName() {
        List<Item> actual = Arrays.asList(
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
        actual.sort(new ItemDescByName());
        assertThatList(actual).isEqualTo(expected);
    }
}