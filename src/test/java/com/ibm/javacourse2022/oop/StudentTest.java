package com.ibm.javacourse2022.oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    HashMap<String, Float> grades;
    ArrayList<String> subjects;
    Student student1, student2, student3;

    @BeforeEach
    void setUp() {
        subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Computer Science");
        subjects.add("Java");
        subjects.add("Database");
        grades = new HashMap<>();//declare
        //init
        grades.put("Math", 5.5F);
        grades.put("Computer Science", 6.0F);
        grades.put("Java", 4.5F);
        grades.put("Database", 6.0F);

        student1 = new Student("Steven", "Teskari", 18, 1l);
        student1.setGrades(grades);//pass grades to student1
        student1.setListSubjects(subjects);
        student2 = new Student("Siyana", "Stoyanova", 22, 2l);
        student2.setGrades(grades);
        student2.setListSubjects(subjects);
        student3 = new Student("Georgi", "Stefanov", 15, 3l);
        student3.setGrades(grades);
        student3.setListSubjects(subjects);
    }

    @Test
    void showSubjects() {
        assertEquals(4, student1.getListSubjects().size());
        assertEquals(4, student2.getListSubjects().size());
        assertEquals(4, student3.getListSubjects().size());
    }

    @Test
    void testStudentsApp() throws Exception {
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        // students.forEach(System.out::println);
        Collections.sort(students);
        students.forEach(System.out::println);
        System.out.println("Sorting according grade of students");
        Collections.sort(students, (Student s1, Student s2) -> {
            return s1.getName().compareTo(s2.getName());
        });
        students.forEach(System.out::println);
        Comparator<Student> byLastName = (s1, s2) -> s1.getLastName().compareTo(s2.getName());
        Comparator<Student> byGrade = (Student s1, Student s2) -> {
            if (s1.gradesStudent() == s2.gradesStudent()) return 0;
            else if (s1.gradesStudent() == s2.gradesStudent()) return 1;
            else return -1;
        };
        students.sort(byGrade);
        Collections.sort(students, (p1, p2) -> {
            if (p1.getFacNum() == p2.getFacNum()) return 0;
            else if (p1.getFacNum() > p2.getFacNum()) return 1;
            else return -1;
        });
    }

    @Test
    void gradesStudent() {
        assertEquals(4, grades.size());
        assertEquals(5.5F, student1.gradesStudent());
    }

    @Test
    void getName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void getAge() {
        assertEquals(18, student1.getAge());
    }
}