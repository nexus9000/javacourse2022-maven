package com.ibm.javacourse2022.run.algo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollectionsTest {
    public Optional<String>  value = Optional.of("");
    @DisplayName("test linked list")
    @Test
    void testLinkedList() throws Exception {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Ney York");
        ll.add("Sofia");
        ll.add("Las Vegas");
        ll.add("San Francisco");
        ll.add("Sofia");
        assertTrue(ll.remove((String) "Sofia"));
        ll.forEach(System.out::println);
        assertEquals(4, ll.size());
    }

    @Test
    @DisplayName("test hash map")
    void testHashMap() throws Exception {
        //key--> value
        HashMap<Integer, String> cities = new HashMap<>();
        cities.put(10000, "Ney York");
        cities.put(10001, "Ney York");
        cities.put(1000, "sofia");
        cities.put(10002, "Las Vegas");
        assertEquals(4, cities.size());
        for (Map.Entry<Integer, String> entry : cities.entrySet()) {
            System.out.printf("%d %S%n", entry.getKey(), entry.getValue());
        }
    }

    @Test
    @DisplayName("test linkedHashMap")
    void testLinkedHashMap() throws Exception {
        //keep order
        LinkedHashMap<Integer, String> cities = new LinkedHashMap<>();
        cities.put(10000, "Ney York");
        cities.put(10001, "Ney York");
        cities.put(1000, "sofia");
        cities.put(10002, "Las Vegas");
        assertEquals(4, cities.size());
        for (Map.Entry<Integer, String> entry : cities.entrySet()) {
            System.out.printf("%d %S%n", entry.getKey(), entry.getValue());
        }
    }

    @Test
    void testHashSet() throws Exception {
        //doesn't keep order Unique values
        HashSet<String> cities = new HashSet<>();
        cities.add("Ney York");
        cities.add("Sofia");
        cities.add("Las Vegas");
        cities.add("New Jersey");
        cities.add("New Jersey");//ignore hash set doesnt add element
        assertEquals(4, cities.size());
       cities.stream().filter(s -> (s.startsWith("N"))).map(s->s.toUpperCase()).forEach(System.out::println);
       Ops add = (Number a, Number b)-> a.doubleValue()+b.doubleValue();
       System.out.println(add.ops(10,30));

       Ops minus = (Number a , Number b)-> a.doubleValue()-b.doubleValue();
       System.out.println(minus.ops(10,30));
       StringUtils format = (String str)-> str.toUpperCase();
       System.out.println(format.formatString("test message"));
        StringUtils trim = (String str)-> str.trim();
        System.out.println(trim.formatString("   test message "));
        assertEquals("password", " password".trim());

    }

    @Test
    @DisplayName("regex")
    @Disabled
     void testRegEx()throws Exception{
         Pattern pattern = Pattern.compile("this is the text message for searching with regex",
                 Pattern.CASE_INSENSITIVE);
         Matcher match = pattern.matcher("this*");
         boolean isFound = match.find();
         System.out.println(isFound);
         //assertTrue(isFound);
     }
      @Test
      void testOptional(){
        String[] words = new String[5];
        //value = Optional.of("new value");
       if(!value.isEmpty()) value.toString().toUpperCase().trim();
        //Optional<String> password = Optional.ofNullable("1234");
       //Assertions.assertThrows( NullPointerException.class,words[2].toLowerCase());

      }
      interface StringUtils{
         public String formatString(String string);
      }
      interface Ops{
        public Number ops(Number a, Number b);
      }
}
