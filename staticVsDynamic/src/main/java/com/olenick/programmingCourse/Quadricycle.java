package com.olenick.programmingCourse;

public class Quadricycle extends Vehicle {
    protected  Double getWidth() { return 2.0; }
    protected  Double getHeight() { return 1.0; }
    protected  Double getLength() { return 3.0; }
    protected  String getTypeAsString() { return "quadricycle"; }
    
     public Dimensions getDimensions() {
        return new Dimensions(getWidth(), getHeight(), getLength());
    }

    protected final String name;

    public Quadricycle(String name) {
        this.name = name;
    }

    protected String getName() { return name; }
}
