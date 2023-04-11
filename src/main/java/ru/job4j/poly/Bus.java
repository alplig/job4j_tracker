package ru.job4j.poly;

public class Bus implements Transport {
    int passengersCount = 0;

    @Override
    public void ride() {
        System.out.println("В пути");
    }

    @Override
    public void passengers(int number) {
        passengersCount += number;
    }

    @Override
    public double refuel(double fuel) {
        return fuel * 60.2;
    }
}
