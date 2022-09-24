package com.ibm.javacourse2022.oop;

public enum Planet {

    MERCURY(3.30e+23,2.4397e6){

    },EARTH(5.97e+24,6.378e6){

    },JUPITER(1.9e+27,7.14e7){

    };
    private final double mass;
    public double surfaceWeight(){
        return 3 * surfaceGravity();
    }
    private final double radius;
    public static final double G = 6.67300E-11;//universal GRAVITY Constant
    private Planet(double mass, double radius){

        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }
    double surfaceGravity(){

        return G*mass/(radius*radius);
    }

    public static void main(String[]arg){


      //  System.out.println(MERCURY.surfaceWeight());
        for(Planet p : Planet.values()){
            System.out.println(p + " weight is  "+p.surfaceGravity());
        }
    }


}
