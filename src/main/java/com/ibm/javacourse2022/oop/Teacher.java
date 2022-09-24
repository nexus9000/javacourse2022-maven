package com.ibm.javacourse2022.oop;

import java.io.Serializable;

public class Teacher<T> extends Person implements Faculty, Comparable<Teacher>, Serializable {
    private  String name;
    private  String lastName;
    private  int age;

    //<= 7
    public Teacher(String name, String lastName, int age) {
        this.name = name;
        this.lastName = name;
        this.age = age;
    }
    public Teacher(){

    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public void printName() {

    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }
}
