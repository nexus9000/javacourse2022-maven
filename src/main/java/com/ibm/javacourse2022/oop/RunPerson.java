package com.ibm.javacourse2022.oop;

public class RunPerson {
    public static void main(String[] arg) {
        PersonFactory pf = new PersonFactory();
        Person<Teacher> teacher = pf.getPerson("teacher".toUpperCase());
        Person<Student> student = pf.getPerson("student".toUpperCase());
        Person<Administrators> administrators = pf.getPerson("administrators".toUpperCase());
        System.out.println(teacher.lastName);
    }
}
