package Module3;

import java.util.ArrayList;

public class Circle extends Shape implements Area {
    private double r;

    public Circle() {
        r = 0;
        coordList = new ArrayList<Point>();
        name = "Circle";
    }

    public Circle(Point center, double radius) {
        name = "Circle";
        coordList = new ArrayList<Point>();
        coordList.add(center);
        r = radius;

    }

    public double getRadius() {
        return r;
    }

    @Override
    public String coordToString() {
        String list = "Center coordinates and radius: ";
        list = list + coordList.get(0).toString() + " " + r;
        return list;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * r;

    }

}