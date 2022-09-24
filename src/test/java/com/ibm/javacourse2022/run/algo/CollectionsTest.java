package com.ibm.javacourse2022.run.algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollectionsTest {
    @DisplayName("test linked list")
    @Test
    void testLinkedList()throws Exception{
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ney York");
        ll.add("Sofia");
        ll.add("Las Vegas");
        ll.add("San Francisco");
        ll.add("Sofia");
        assertTrue(ll.remove((String)"Sofia"));
        ll.forEach(System.out::println);
        assertEquals(4, ll.size());
    }
    @Test
    @DisplayName("test hash map")
     void testHashMap()throws Exception{
        //key--> value
        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(10000, "Ney York");
        cities.put(10001, "Ney York");
        cities.put(1000, "sofia");
        cities.put(10002, "Las Vegas");
        assertEquals(4, cities.size());
        for(Map.Entry<Integer,String> entry : cities.entrySet()){
            System.out.printf("%d %S%n",entry.getKey(),entry.getValue());
        }
     }
     @Test
     @DisplayName("test linkedHashMap")
     void testLinkedHashMap()throws Exception{
        //keep order
         LinkedHashMap<Integer,String> cities = new LinkedHashMap<>();
         cities.put(10000, "Ney York");
         cities.put(10001, "Ney York");
         cities.put(1000, "sofia");
         cities.put(10002, "Las Vegas");
         assertEquals(4, cities.size());
         for(Map.Entry<Integer,String> entry : cities.entrySet()){
             System.out.printf("%d %S%n",entry.getKey(),entry.getValue());
         }
     }

}
