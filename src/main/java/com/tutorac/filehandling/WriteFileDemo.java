package com.tutorac.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {
    public static void main(String[] args) throws IOException {
        String fileContent = "Hello there! I will be written to a text file in this program";
        File file = new File("generated.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(fileContent.getBytes());

        // IF INTERESTED STUDY SERIALIZATION AND DESERIALIZATION ONLINE!
    }
}
