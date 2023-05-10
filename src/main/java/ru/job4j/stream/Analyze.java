package ru.job4j.stream;

import java.util.Comparator;
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
        return stream.flatMap(avg -> avg.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, Collectors.summarizingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue().getAverage()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(x -> new Tuple(
                x.name(),
                x.subjects().stream()
                        .mapToDouble(Subject::score)
                        .sum()
                ))
                .max(Comparator.comparingDouble(Tuple::score))
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(x -> x.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, Collectors.summarizingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue().getSum()))
                .max(Comparator.comparingDouble(Tuple::score))
                .orElse(null);
    }
}
