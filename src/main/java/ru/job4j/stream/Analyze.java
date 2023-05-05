package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(avg -> avg.subjects().stream())
                .mapToDouble(Subject::score)
                .average()
                .getAsDouble();
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.map(x -> new Tuple(
                        x.name(),
                        x.subjects().stream()
                                .mapToDouble(Subject::score)
                                .average()
                                .getAsDouble()
                        ))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.flatMap(avg -> Stream.of(avg.subjects()))
                .flatMap(x -> x.stream().)
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}
