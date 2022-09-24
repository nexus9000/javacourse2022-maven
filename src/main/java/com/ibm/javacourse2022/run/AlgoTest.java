package com.ibm.javacourse2022.run;

public class AlgoTest {
    public static void main(String[]arg){
        int array[] = new int[111];//declare array with 5 elements
        //init with values
        for(int i = 0; i < array.length; i++){
           array[i] = i*i;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        //linear search
        var search = 900;
        int j = 0;
        for(int i = 0; i < 10; i++) {

            j++;//incremental

        }
        System.out.println(j);
        for(int i = 0; i < array.length; i++){
            if(array[i] == search){
                System.out.println(search +" was found in index " + i);
                break;
            }
        }
    }
}
