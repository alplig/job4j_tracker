package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CardDeck {
    List<Card> cardsDeck = new ArrayList<>();

    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        cd.cardsDeck = Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> new Card(suit, value))).toList();
        for (Card c: cd.cardsDeck) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }
    }
}
