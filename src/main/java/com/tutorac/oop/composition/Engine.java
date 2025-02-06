package com.tutorac.oop.composition;

public class Engine {
    private String brand;
    private int engineCapacityInCc;
    private float maxTorque;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getEngineCapacityInCc() {
        return engineCapacityInCc;
    }

    public void setEngineCapacityInCc(int engineCapacityInCc) {
        this.engineCapacityInCc = engineCapacityInCc;
    }

    public float getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(float maxTorque) {
        this.maxTorque = maxTorque;
    }
}
