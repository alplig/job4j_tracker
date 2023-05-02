package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(28, "Masha"));
        input.add(new Student(128, "Pety"));
        List<Student> expected = List.of(
                new Student(128, "Pety"),
                new Student(28, "Masha")
        );
        assertThat(StudentLevel.levelOf(input, 20)).containsSequence(expected);
    }

    @Test
    public void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 20)).containsAll(expected);
    }

    @Test
    public void whenHasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student(28, "Pety"));
        List<Student> expected = List.of(new Student(28, "Pety"));
        assertThat(StudentLevel.levelOf(input, 20)).containsAll(expected);
    }

    @Test
    public void whenWhileScoreOver60() {
        List<Student> input = Arrays.asList(
                new Student(61, "Yaroslav"),
                new Student(28, "Masha"),
                new Student(66, "Vasya"),
                new Student(99, "Natasha"),
                new Student(2, "Michail")
        );
        List<Student> expected = List.of(
                new Student(99, "Natasha"),
                new Student(66, "Vasya")
        );
        assertThat(StudentLevel.levelOf(input, 60))
                .containsAll(expected)
                .containsSequence(expected);

    }
}