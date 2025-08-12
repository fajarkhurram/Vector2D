package Vector_Points;

public class Point {

    private double x;
    private double y;

    public Point(double x , double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void set(double x , double y){
        this.x = x;
        this.y = y;
    }

    //Point - Point = vector
    public Vector2D subPoints(Point other){
        return new Vector2D(this.x- other.x , this.y-other.y);
    }

    @Override
    public String toString(){
        return ("("+x+","+y+")");
    }
}
