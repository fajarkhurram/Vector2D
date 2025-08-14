package Vector_Operations;

import Vector_Points.Point;
import Vector_Points.Vector2D;


public class Product {
    private Point p1;
    private Point p2;

    //dot product of two vectors returns scalar
    public  double dotProduct(Vector2D v1 , Vector2D v2){
        double scalar = (v1.getX()*v2.getX())+(v1.getY()*v2.getY());
        return scalar;
    }

    //cross product: v1 x v2 = (v1.x * v2.y) - (v1.y * v2.x)
    // it also returns a scalar quantity
    public  double crossProduct(Vector2D v1, Vector2D v2){
//
        double scalar =  (v1.getX()*v2.getY()) - (v1.getY()*v2.getX());
        return scalar;
    }
}
