package Module3;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape implements Area{
    protected List<Point> coordList;
    protected String name;
    public Shape(){
        coordList=new ArrayList<Point>();
        name="Shape";
    }
    public Shape(String name, Point [] masPoints){
        this.name=name;
        coordList=new ArrayList<Point>();
        for (int i=0; i<masPoints.length; i++){
            coordList.add(masPoints[i]);
        }
    }
    public String getName(){
        return name;
    }
    public String coordToString(){
        String list="List of coordinates: ";
        for (Point p : coordList){
            list=list+p.toString();
        }
        return list;
    }

}
