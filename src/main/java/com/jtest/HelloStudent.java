package com.jtest;

import com.ktest.Person;
import com.ktest.Student;

public class HelloStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());

        Person person = new Person("John", true);
        System.out.println(person.isMarried());
    }
}
