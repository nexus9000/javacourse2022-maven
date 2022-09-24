package com.ibm.javacourse2022.oop;

import java.time.format.DateTimeFormatter;

public class OutterClass {
    private static  int outterClassMember = 101;
    //inner class
    class InnerClass{
        int innerClassMember = 102;
        public void printMessage(){
            System.out.println("call private member of Outer class "+ outterClassMember);
        }
    }//end Inner Class
    static class InnerClass2{
        public void printCurrentDate(){
            System.out.println(java.time.LocalDate.now());
        }
        public void printCurrentTime(){
            System.out.println(java.time.LocalTime.now());
        }
        public void printTimeDate(){
            System.out.println(java.time.LocalDateTime.now());
        }
        public void printMessage(){
            System.out.println("call private member of Outer class "+ outterClassMember);
        }
        public void formatDateTime(){
            java.time.LocalDateTime myTime = java.time.LocalDateTime.now();
            java.time.format.DateTimeFormatter format =
                    java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String formatDate = format.format(myTime);
            System.out.printf("%S%n", formatDate);
        }
    }

    public static void main(String...arg){
        OutterClass out = new OutterClass();
        OutterClass.InnerClass inner = out.new InnerClass();
        System.out.println(inner.innerClassMember);
        inner.printMessage();
        OutterClass.InnerClass2 inner2 = new OutterClass.InnerClass2();
        inner2.printCurrentDate();
        inner2.printCurrentTime();
        inner2.printTimeDate();
        inner2.formatDateTime();
    }
}//end body class
