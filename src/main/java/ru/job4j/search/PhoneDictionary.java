package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> inPhone = (p) -> p.getPhone().contains(key);
        Predicate<Person> inAddress = (p) -> p.getAddress().contains(key);
        Predicate<Person> inName = (p) -> p.getName().contains(key);
        Predicate<Person> inSurname =  (p) -> p.getSurname().contains(key);
        Predicate<Person> combine = inPhone.or(inAddress).or(inName).or(inSurname);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;

    }
}