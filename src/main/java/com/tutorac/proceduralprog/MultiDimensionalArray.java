package com.tutorac.proceduralprog;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//        String[] students = {"thafim", "sid", "abc", "def"}
        // <DATA_TYPE>[][] <VARIABLE_NAME> = <DATA_TYPE>[5][10];
        // <DATA_TYPE>[][] = {"VALUES..." {"DATA..."}};
//        String[][] studentDetails = new String[5][3];
        String[][] studentDetails = {
                {"id", "rollno", "name", "phone", "email"},
//                0,0      0,1      0,2     0,3      0,4
                {"1", "10", "thafim", "208302183", "thafim@gmail.com"},
//                1,0   1,1     1,2         1,3            1,4
                {"2", "12", "sid", "218321312", "sid@gmail.com"}
//                2,0  2,1   2,2       2,3          2,4
        };
//        System.out.println(studentDetails.length);
//        System.out.println(studentDetails[0][3]);
        for(int i=0; i<studentDetails.length; i++) {
//            System.out.println(studentDetails[i][0]);
//            System.out.println(studentDetails[i][1]);
//            System.out.println(studentDetails[i][2]);
//            System.out.println(studentDetails[i][3]);
//            System.out.println(studentDetails[i][4]);
            for(int j=0; j<studentDetails[i].length; j++) {
                System.out.println(studentDetails[i][j]);
            }
            System.out.println("------------------");
        }
//        System.out.println(studentDetails[0].length);

//        {"a","b","c"} - 3
//        {{"thafim","sid"}, {"student1", "student2"}, {"student4", "student5"}}
    }
}
