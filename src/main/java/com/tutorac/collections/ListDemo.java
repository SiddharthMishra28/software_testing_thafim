package com.tutorac.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // List<DATA_TYPE> variable_name = new ArrayList<>() / new LinkedList<>();
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("Hi");
        myList.add("Wassup");
        System.out.println(myList);
        myList.add(2, "Ola");
        System.out.println(myList);
    }
}
