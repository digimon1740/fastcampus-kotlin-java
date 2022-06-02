package com.fastcampus.kotlinjava.gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {

    public static void main(String[] args) {
        Student student = new Student();

        student.name = "스티브로저스";
        student.setBirthDate(LocalDate.of(1918, 7, 4));

        System.out.println(student.name);
        System.out.println(student.getBirthDate());


        //student.setAge(10);
        //System.out.println(student.getAge());

        student.changeGrade("");
        System.out.println(student.getGrade());
    }
}
