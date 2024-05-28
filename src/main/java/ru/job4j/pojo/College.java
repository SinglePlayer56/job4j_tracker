package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Korchagin Viktor Sergeevich");
        student.setGroup("2B");
        student.setAdmissionDate(new Date());
        System.out.println(student.getFullName());
        System.out.println(student.getGroup());
        System.out.println(student.getAdmissionDate());
    }
}
