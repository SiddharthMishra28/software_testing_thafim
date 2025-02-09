package com.tutorac.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> mySets = new HashSet<>();
        mySets.add("Hello");
        mySets.add("Hello");
        mySets.add("Hello");
        mySets.add("Hello");
        mySets.add("Wassup");
        System.out.println(mySets);
    }
}
