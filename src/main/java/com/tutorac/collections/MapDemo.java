package com.tutorac.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
//        Map<Integer, String> students = new HashMap<>();
//        Map<Integer, String> students = new LinkedHashMap<>();
//        Map<Integer, String> students = new TreeMap<>();
//        students.put(1, "sid");
//        students.put(2, "thafim");
//        students.put(3, "shankar");
//        students.put(4, "shivam");
//        System.out.println(students);

        Map<String, String> students = new TreeMap<>();
        students.put("a", "sid");
        students.put("c", "thafim");
        students.put("b", "shankar");
        students.put("d", "shivam");
        System.out.println(students);
    }
}
