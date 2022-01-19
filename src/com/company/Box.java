package com.company;

public class Box {
    public double width;
    public double height;
    public double length;

    public Box(double width, double height,double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double countVolume(){
        return width * height * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
