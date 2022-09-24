package com.ibm.javacourse2022.run.algo;

import com.ibm.javacourse2022.run.calculator.CalculatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import org.apache.commons.lang3.RandomStringUtils;
import java.util.Random;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ArraysTest {
Random random;
static final long SEED = 123l;
    @BeforeEach
    void setUp() {
       random = new Random();
       random.setSeed(SEED);
    }
    @DisplayName("Test arrays")
    @Test
    void testArrays()throws Exception{
        Integer [] testArray = initInteger(10);//autoboxing
        assertEquals(10, testArray.length);
       // iterateArray(testArray);//show all elements in array
        String [] arrayString = initString(10);
        assertEquals(10, arrayString.length);
        iterateArrays(arrayString);
        iterateArrays(testArray);
    }
    @Test
    void testArraysSize()throws Exception{
        int [] array =  new int[10];//0-->9
        //throw exception out of index but test is ok
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->array[10]=10);

      }


    @Test
    void testSorting()throws Exception{
        Integer[] arrays = {101,88,13,44,1,7,1001};
        Integer[] sorted =   sortInsertion(arrays);
        System.out.println("After sorting");
        iterateArrays(sorted);
        assertEquals(7, arrays.length);
    }
    //Generics method
    <E>void iterateArrays(E[] values){
        for(E value : values){
            System.out.print(" "+value);
        }
    }
    Integer [] initInteger(int size){
        Integer [] array = new Integer[size];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1_000);
        }
        return array;
    }

   Integer [] sortInsertion(Integer [] unsorted){
        for(int i = 1; i < unsorted.length; i++){
          int temp = unsorted[i];
          int j = i-1;//j = 0;
          while((j >= 0) && (temp < unsorted[j])){
                unsorted[j+1]=unsorted[j];
                j--;
                if(j == -1)break;
          }//end while
          unsorted[j+1] = temp;
        }
        return unsorted;
   }

    String [] initString(int size){
        String array[] = new String[size];
        for(int i = 0; i < array.length; i++){
          array[i] = RandomStringUtils.randomAlphabetic(8);
        }
        return array;
    }
}