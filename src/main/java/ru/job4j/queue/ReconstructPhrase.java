package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        int size = evenElements.size();
        StringBuilder stringBuilder = new StringBuilder(size / 2);
        for (int i = 0; i < size / 2; i++) {
            stringBuilder.append(evenElements.pollFirst());
            evenElements.pollFirst();
        }
        return stringBuilder.toString();
    }

    private String getDescendingElements() {
        int size = descendingElements.size();
        StringBuilder stringBuilder = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            stringBuilder.append(descendingElements.pollLast());
        }
        return stringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
