package models;

import java.util.ArrayList;

public class Shape {
    // create a container of Points - ArrayList<Point>
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    // addPoint(Point point) - adds this point into the container
    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        return 0;
    }

    public double getLongestSide() {
        return 0;
    }

    public double getAverageSide() {
        return 0;
    }

}
