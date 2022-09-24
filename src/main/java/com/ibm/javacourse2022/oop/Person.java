package com.ibm.javacourse2022.oop;

import java.io.Serializable;

public abstract class Person<T> implements Serializable {

    public String name;
    public String lastName;
    public int age;
    public abstract String getName();
    public abstract String getLastName();
    public abstract int getAge();

    @Override
    public String toString() {
        return name + " "+lastName + " "+ age;
    }
}
