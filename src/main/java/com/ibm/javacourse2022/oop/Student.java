package com.ibm.javacourse2022.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class Student<T> extends Person implements Comparable<Student> {
    private  String name;
    private  long facNum;
    private  String lastName;
    private  int age;
    //<= 7
    private ArrayList<String> listSubjects;
    private HashMap<String, Float> grades;

    public void setListSubjects(ArrayList<String> listSubjects) {
        this.listSubjects = listSubjects;
    }

    public HashMap<String, Float> getGrades() {
        return grades;
    }

    public  ArrayList<String> getListSubjects() {
        return listSubjects;
    }

    public Student(String name, String lastName, int age, long facNum) {
        this.name = name;
        super.name = name;
        this.lastName = lastName;
        super.lastName = lastName;
        this.age = age;
        super.age = age;
        this.facNum = facNum;
    }
    public Student(){
    }

    public void setGrades(HashMap<String, Float> grades) {
        this.grades = grades;
    }

    public void showSubjects() {
        listSubjects.forEach(p -> System.out.println(p));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFacNum(long facNum) {
        this.facNum = facNum;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getFacNum() {
        return facNum;
    }

    public float gradesStudent() {
        float gradesNum = 0.0f;
        for (Map.Entry<String, Float> map : grades.entrySet()) {
            gradesNum += map.getValue();
        }
        return gradesNum / grades.size();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + " fac. Number " + this.facNum;
    }

    @Override
    public int compareTo(Student st) {
        if (this.age == st.age) return 0;
        else if (this.age > st.age) return 1;
        else return -1;
    }
}
