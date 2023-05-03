package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String o1Split = o1.split("/")[0];
        String o2Split = o2.split("/")[0];
        return o2Split.compareTo(o1Split) != 0 ? o2Split.compareTo(o1Split) : o1.compareTo(o2);
    }
}
