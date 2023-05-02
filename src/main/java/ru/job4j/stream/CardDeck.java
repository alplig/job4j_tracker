package ru.job4j.stream;

import java.util.List;
import java.util.stream.Stream;

public class CardDeck {
    public static void main(String[] args) {
        List<Card> cardsDeck = Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> new Card(suit, value)))
                .toList();
        cardsDeck.forEach(System.out::println);
    }
}
