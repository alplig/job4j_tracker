package ru.job4j.stream;

import java.util.List;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(x -> x.getStandard() - x.getActual() >= 0)
                .filter(x -> x.getStandard() - x.getActual() <= 3)
                .map(x -> new Label(x.getName(), (float) (x.getPrice() * 0.5)))
                .map(Label::toString)
                .toList();
    }
}
