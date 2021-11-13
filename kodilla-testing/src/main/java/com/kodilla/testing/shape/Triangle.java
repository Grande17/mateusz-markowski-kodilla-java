package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String shapeName;
    private int baseLength;
    private double height;

    public Triangle(String shapeName, int baseLength, int height) {
        this.shapeName = shapeName;
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (baseLength != triangle.baseLength) return false;
        if (Double.compare(triangle.height, height) != 0) return false;
        return shapeName.equals(triangle.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        result = 31 * result + baseLength;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField() {
        double field = (1/2)*baseLength*height;
        return field;
    }
}
