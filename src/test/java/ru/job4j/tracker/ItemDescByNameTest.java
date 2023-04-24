package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.ListAssert.assertThatList;

class ItemDescByNameTest {
    @Test
    public void whenItemsDescByName() {
        Item a = new Item("a");
        Item b = new Item("b");
        Item c = new Item("c");
        Item d = new Item("d");
        Item e = new Item("e");
        List<Item> actual = Arrays.asList(c, b, a, e, d);
        List<Item> expected = List.of(e, d, c, b, a);
        actual.sort(new ItemDescByName());
        assertThatList(actual).isEqualTo(expected);
    }

    @Test
    public void whenSortedItemsDescByName() {
        Item a = new Item("a");
        Item b = new Item("b");
        Item c = new Item("c");
        Item d = new Item("d");
        Item e = new Item("e");
        List<Item> actual = Arrays.asList(c, b, a, e, d);
        List<Item> expected = List.of(e, d, c, b, a);
        actual.sort(new ItemDescByName());
        assertThatList(actual).isEqualTo(expected);
    }
}