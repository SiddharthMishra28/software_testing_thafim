package com.tutorac.oop.inheritance;

public class VolumeUtils extends AreaUtils {
    int depth;

    public int calculateVolume() {
        return this.length* this.width * this.depth;
    }

    public double calculateVolume(boolean isSphere) {
        return (4/3) * Math.PI * this.radius * this.radius * this.radius;
    }

    public double calculateSurfaceArea() {
        return 2*((this.width*this.length)+(this.length*this.depth)+(this.depth*this.width));
    }

    public double calculateSurfaceArea(boolean isSphere) {
        return 4 * Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        VolumeUtils utils = new VolumeUtils();
        utils.width = 4;
        utils.length = 3;
        utils.depth = 6;

        utils.radius = 15;

        System.out.println(utils.calculateArea());
        System.out.println(utils.calculateVolume());

        System.out.println(utils.calculateArea(true));

        System.out.println(utils.calculateVolume(true));
    }
}
