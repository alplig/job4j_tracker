package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.ListAssert.assertThatList;

class ItemAscByNameTest {
    @Test
    public void whenItemsAscByName() {
        List<Item> actual = Arrays.asList(
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
        actual.sort(new ItemAscByName());
        assertThatList(actual).isEqualTo(expected);
    }

    @Test
    public void whenSortedItemsAscByName() {
        List<Item> actual = Arrays.asList(
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
        actual.sort(new ItemAscByName());
        assertThatList(actual).isEqualTo(expected);
    }
}