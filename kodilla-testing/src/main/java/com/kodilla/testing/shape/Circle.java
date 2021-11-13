package com.kodilla.testing.shape;

public class Circle implements  Shape{
    private String shapeName;
    private double radius;

    public Circle(String shapeName, int radius) {
        this.shapeName = shapeName;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.radius, radius) != 0) return false;
        return shapeName.equals(circle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        double field = Math.PI * Math.pow(radius, 2);
        return field;
    }
}
