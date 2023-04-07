package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            if (matches < 4) {
                if (count >= matches) {
                    count -= matches;
                    System.out.println("Спичек осталось: " + count);
                    if (count == 0) {
                        break;
                    }
                } else {
                    System.out.printf("На столе осталось спичек: %s, вы не можете взять %s%n", count, matches);
                }
            } else {
                System.out.println("Введите число в пределах от 1 до 3 (включительно)");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }

    }
}
