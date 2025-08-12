package Vector_Operations;

import Vector_Points.*;

public class Addition {

    public  Vector2D add(Vector2D other1 , Vector2D other2){
        Vector2D sum = new Vector2D(other1.getX()+other2.getX(), other1.getY()+other2.getY());
        return sum;
    }


}
