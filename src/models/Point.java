package models;

public class Point {
    private double x;
    private double y;

    // create a constructor having both fields
    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    // create a method distance to calculate the distance from current point to the dest point

    // toString()
}
