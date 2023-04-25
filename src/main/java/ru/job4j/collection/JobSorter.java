package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("A", 1),
                new Job("B", 4),
                new Job("B", 2),
                new Job("D", 0)
        );

        Comparator<Job> x = new JobAscByName();
        Collections.sort(jobs, x);
        System.out.println(jobs);
        Comparator<Job> y = new JobDescByName();
        Collections.sort(jobs, y);
        System.out.println(jobs);
        Collections.sort(jobs, new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);
    }
}
