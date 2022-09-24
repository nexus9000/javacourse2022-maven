package com.ibm.javacourse2022.oop;

import org.junit.jupiter.api.Test;
import org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class EnumTest {

    public enum WeekendDays{
        SATURDAY,SUNDAY
    }

    WeekendDays weekendDays;
    public EnumTest(){
     //   this.weekendDays = wd;

    }
    @Test
    void printStatus(){
        EnumTest firstDay = new EnumTest();
        WeekendDays sat = WeekendDays.SATURDAY;
        System.out.println(sat);
        assertThat(firstDay, notNullValue());
       // firstDay.printActivity();
    }



    public void printActivity() {
//        switch (wd) {
//            case MONDAY: {
//                System.out.println("Mondays are bad");
//                break;
//            }
//            case FRIDAY: {
//                System.out.println("FRIDAYS ARE BETTER!");
//                break;
//            }
//        }
        switch(weekendDays){
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are the best!");
        }
    }



}
