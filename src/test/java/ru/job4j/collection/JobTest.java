package ru.job4j.collection;

import org.junit.jupiter.api.Test;


import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

class JobTest {
    @Test
    public void whenAscByNameAB() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("A", 1),
                new Job("B", 2)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenAscByNameBA() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("B", 1),
                new Job("A", 2)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenAscByNameAA() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("A", 1),
                new Job("A", 2)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenAscByPriority12() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("A", 1),
                new Job("B", 2)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenAscByPriority21() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("A", 2),
                new Job("B", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenAscByPriority11() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("A", 1),
                new Job("B", 1)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenDescByNameBA() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("B", 1),
                new Job("A", 2)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenDescByNameAB() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("A", 1),
                new Job("B", 2)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenDescByNameAA() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("A", 1),
                new Job("A", 2)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenDescByPriority21() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("A", 2),
                new Job("B", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenDescByPriority12() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("A", 1),
                new Job("B", 2)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    @Test
    public void whenDescByPriority11() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("A", 1),
                new Job("B", 1)
        );
        assertThat(rsl).isEqualTo(0);
    }

    @Test
    public void whenComparatorAscByNameAndAscPriorityAB01() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("A", 1),
                new Job("B", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByNameAndAscPriorityAA01() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("A", 0),
                new Job("A", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByNameAndDescPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByNameAndDescPriorityAA01() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("A", 1),
                new Job("A", 0)
        );
        assertThat(rsl).isLessThan(0);
    }

}