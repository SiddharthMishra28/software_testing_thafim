package com.tutorac.oop.inheritance;

public class AreaUtils {
    int width;
    int length;
    int radius;

    public int calculateArea() {
        return width*length;
    }

    public double calculateArea(boolean isCircle) {
        return Math.PI * radius * radius;
    }
}
