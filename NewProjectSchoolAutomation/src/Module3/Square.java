package Module3;

import java.util.ArrayList;

public class Square extends Shape implements Area {

    public Square() {
        coordList = new ArrayList<Point>();
        name = "Square";
    }

    public Square(Point[] masPoints) {

        super("Square", masPoints);

    }

    @Override
    public double getArea() {
        double a = coordList.get(0).distance(coordList.get(1));
        double b = coordList.get(1).distance(coordList.get(2));
        return a * b;

    }

}