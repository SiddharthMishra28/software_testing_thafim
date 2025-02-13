package com.tutorac.filehandling;

import java.io.*;

public class ReadFileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        System.out.println((int)'T');
        int byteData;
        FileInputStream fis = new FileInputStream(file);
        while((byteData = fis.read()) != -1) {
            System.out.print((char)byteData);
        }
//        FileReader reader = new FileReader(file);
//        BufferedReader br = new BufferedReader(reader);
//        System.out.println(br.readLine());
    }
}
