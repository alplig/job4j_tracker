package ru.job4j.queue;

import java.util.Comparator;

public class TransactionSortDescById implements Comparator<Transaction> {
    @Override
    public int compare(Transaction o1, Transaction o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
