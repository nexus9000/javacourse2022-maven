package com.ibm.javacourse2022.oop;

public class ComputerScience implements Faculty{
    private  String name;
    public ComputerScience(String name){
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println(name);
    }
}
