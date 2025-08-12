package Vector_Operations;

import Vector_Points.Vector2D;

public class Subtraction {

    public  Vector2D sub(Vector2D other1 , Vector2D other2){
        Vector2D diff = new Vector2D(other1.getX()-other2.getX(), other1.getY()-other2.getY());
        return diff;
    }
}
