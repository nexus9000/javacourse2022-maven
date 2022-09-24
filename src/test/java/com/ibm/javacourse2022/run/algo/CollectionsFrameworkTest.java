package com.ibm.javacourse2022.run.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsFrameworkTest {
    @BeforeEach
    void setUp(){

    }
    @Test
    void testArrayList()throws Exception{
        List<Integer> list = new ArrayList<>(101);//dynamic arrays
        list.add(12);//add elements
        list.add(123);
        list.add(188);
        list.add(123);
         //allow duplicate
        //keep order
        //very effective access by index
        //don't used if often delete elements
        for(int i = 0; i < 130; i++){
            list.add(i*i);
        }

        list.set(54,101);
        assertEquals(101, list.get(54));
       // System.out.println(list);
        assertEquals(12, list.get(0));//get elements by index
        assertFalse(list.isEmpty());
        assertEquals(134, list.size());
        list.remove(0);
        assertEquals(133, list.size());
        assertFalse(list.contains(12));
        int removed = list.indexOf(123);
        list.remove(removed);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int value = iterator.next();
           // System.out.println(value);
            if(value==123)iterator.remove();
        }
        assertFalse(list.contains(123));
        //for-each
        //for(int value : list)System.out.println(value);
        //list.forEach(System.out::println);
        List<String> ciscoDevicesAsa = Arrays.asList("ucs","isr","asa","pix", "asa5506x").stream()
                .filter(s->s.startsWith("asa")).map(s->s.toUpperCase()).collect(Collectors.toList());
         ciscoDevicesAsa.forEach(System.out::println);
         int maxNumber = Arrays.asList(111, 99, 33, 78, 78,78,999,-111).parallelStream()
                 .distinct().max(Integer::compareTo).get();
         System.out.println("max number "+maxNumber);
                //map(s-> toString().toUpperCase()).collect(Collectors.toList());

    }


}
