package Module3;

import java.util.ArrayList;

public class Triangle extends Shape implements Area{

    public Triangle (){

        coordList=new ArrayList<Point>();
        name="Triangle";
    }
    public Triangle (Point [] masPoints){
        super("Triangle",masPoints);

    }

    @Override
    public double getArea(){
        double a=coordList.get(0).distance(coordList.get(1));
        double b=coordList.get(1).distance(coordList.get(2));
        double c=coordList.get(2).distance(coordList.get(0));
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }

}