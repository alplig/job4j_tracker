package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Иван Иванович");
        student.setGroup("01.101.03-2");
        student.setDateAdmission(new Date());
        System.out.println("ФИО: " + student.getFio()
                + "; группа: " + student.getGroup()
                + "; дата зачисления: " + student.getDateAdmission());
    }
}
