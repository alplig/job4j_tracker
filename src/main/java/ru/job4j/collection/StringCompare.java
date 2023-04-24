package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int count = left.length() > right.length() ? left.length() : right.length();
        char[] charsLeft = Arrays.copyOf(left.toCharArray(), count);
        char[] charsRight = Arrays.copyOf(right.toCharArray(), count);
        int rsl = 0;
        for (int i = 0; i < count; i++) {
            rsl = charsLeft[i] - charsRight[i];
            if (rsl != 0) {
                break;
            }
        }
        return rsl;
    }
}