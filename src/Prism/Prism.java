package Prism;

import Angle.Angle;

public class Prism {
    private double height;
    private double side;

    public Prism(double height, double side) {
        this.height = height;
        this.side = side;
    }

    public double getBaseArea() {
        double baseArea = (Math.sqrt(3) / 4) * Math.pow(side, 2);

        return baseArea;
    }

    public double getVolume() {
        double baseArea = getBaseArea();
        double volume = baseArea * height;
        return volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String toString() {
        return height + " " + side;
    }

    public boolean equals(Object obj) {
        boolean b = false;
        if ( obj instanceof Prism)
        {
            Prism obj1 = (Prism) obj;
            if (height == obj1.getHeight() && side == obj1.getSide())
                b = true;
        }
        return b;
    }

}
