package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("mail@mail.ru", "Ivanov Ivan Ivanovich");
        hashMap.put("mail1@mail.ru", "Petrov Petr Petrovich");
        hashMap.put("mail1@mail.ru", "Petrov Ivan Petrovich");
        hashMap.put("mail2@mail.ru", "AAA AAA AAA");
        hashMap.put("mail2@mail.ru", "BBB BBB BBB");
        hashMap.put("mail2@mail.ru", "CCC CCC CCC");
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println(value);
        }
    }
}
