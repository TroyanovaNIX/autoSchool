package Module3;

import java.util.Random;
import java.util.Scanner;

class Main{
    public static void main(String args[]){

        Shape[] masFigur=new Shape[10];
        Point[] square1=new Point[4];
        square1[0]=new Point(0,0);
        square1[1]=new Point(0,1);
        square1[2]=new Point(1,1);
        square1[3]=new Point(1,0);
        masFigur[0]=new Square(square1);
        Point[] square2=new Point[4];
        square2[0]=new Point(0,2.3);
        square2[1]=new Point(2.3,2.3);
        square2[2]=new Point(2.3,0);
        square2[3]=new Point(0,0);
        masFigur[1]=new Square(square2);

        Point[] square3=new Point[4];
        square3[0]=new Point(0,0);
        square3[1]=new Point(0,1);
        square3[2]=new Point(1,1);
        square3[3]=new Point(1,0);
        masFigur[2]=new Square(square3);

        Point[] triangle1=new Point[3];
        triangle1[0]=new Point(0,1);
        triangle1[1]=new Point(1,3);
        triangle1[2]=new Point(1,0);
        masFigur[3]=new Triangle(triangle1);

        Point[] triangle2=new Point[3];
        triangle2[0]=new Point(0,0);
        triangle2[1]=new Point(0,1);
        triangle2[2]=new Point(1,1);
        masFigur[4]=new Triangle(triangle2);

        masFigur[5]=new Circle(new Point(1,1), 1);

        Point[] square4=new Point[4];
        square4[0]=new Point(0,0);
        square4[1]=new Point(0,1);
        square4[2]=new Point(1,1);
        square4[3]=new Point(1,0);
        masFigur[6]=new Square(square4);

        Point[] triangle3=new Point[3];
        triangle3[0]=new Point(0,0);
        triangle3[1]=new Point(0,1);
        triangle3[2]=new Point(1,0);
        masFigur[7]=new Triangle(triangle3);

        masFigur[8]=new Circle( new Point(0,1), 2.6);
        masFigur[9]=new Circle(new Point(0,0), 2.5);


        Shape temp;
        for (int i=0; i<masFigur.length;i++){
            for (int j=0; j<masFigur.length-i-1;j++){
                if (masFigur[j].getArea()>masFigur[j+1].getArea()){
                    temp=masFigur[j];
                    masFigur[j]=masFigur[j+1];
                    masFigur[j+1]=temp;
                }
            }
        }



	for (int i=0; i<masFigur.length;i++){
        System.out.println(masFigur[i].getName()+",  S="+masFigur[i].getArea());
    }

}
}