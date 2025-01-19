package com.tutorac.proceduralprog;

public class SingleDimensionalArray {
    public static void main(String[] args) {
//        {"a","b","c"} - Length means as humans, index means as computer which counts from 0
//        0   1   2
        // data structure, multiple values, single variable
        // Homogeneous - Single Type of Data ? Strongly typed
        // <DATA_TYPE>[] <VARIABLE_NAME> = new <DATATYPE>[<SIZE>];
        // <DATA_TYPE>[] <VARIABLE_NAME> = {"comma separated values"};
        String[] students = new String[10]; // 10 strings in a single variable
        int[] rollNumbers = {12,3,4,1,5,78,2,9,15,13};
//                           0, 1,2,3,4....       9 // LAST INDEX = SIZE -1
        float[] heights = {4.3f,5.1f,4.7f,4.8f};
//                            0    1     2    3
        // --------------------------------> X AXIS
//        System.out.println(heights.length);
//        System.out.println(rollNumbers); // CANNOT PRINT
//        DETERMINIE THE SIZE OF AN ARRAY - array.length
        for(int i=0; i<students.length; i++) {
            System.out.println(rollNumbers[i]);
        }
    }
}
