package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private double sideLength;

    public Square(String shapeName, int sideLength) {
        this.shapeName = shapeName;
        this.sideLength = sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.sideLength, sideLength) != 0) return false;
        return shapeName.equals(square.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName.hashCode();
        temp = Double.doubleToLongBits(sideLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public double getField() {
        return Math.pow(sideLength, 2);

    }
}
