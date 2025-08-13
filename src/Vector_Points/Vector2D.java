package Vector_Points;

import java.util.Vector;

public class Vector2D {
    private double x;
    private double y;


    public Vector2D(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Vector2D(double x ,double y){
        this.x = x;
        this.y = y;
    }

    //Point - Point = vector
    public static Vector2D getVector(Point p1, Point p2){
        Vector2D v = new Vector2D(p1.getX()- p2.getX() , p1.getY()- p2.getY());
        System.out.println(v);
        return v;

    }


    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public String toString(){
        return ("("+x+","+y+")");
    }
}
