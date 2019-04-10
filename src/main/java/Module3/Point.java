package Module3;

class Point{

    private double x,y;

    public Point(){
    }

    public Point(double a, double b){
        this.x=a;
        this.y=b;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public String toString(){
        return "{ "+getX()+"; "+getY()+"}, ";
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x-p.getX(),2)+Math.pow(this.y-p.getY(),2));
    }
}
