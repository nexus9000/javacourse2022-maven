package com.ibm.javacourse2022.oop;

import org.jetbrains.annotations.NotNull;

//factory design pattern--creational design pattern
public class PersonFactory {
    public Person getPerson(@NotNull String personType) {
        //switch

        switch (personType) {
            case "STUDENT": {
                return new Student<Student>();
            }
            case "Teacher": {
                return new Teacher<Teacher>();
            }
            case "admin": {
                return new Administrators<Administrators>();
            }
            default: {
                return null;
            }
        }
    }

    public enum WorkingDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }
}
