package Drawing;

import Vector_Points.*;
import Vector_Operations.*;

public class Line {
     private Point start;
     private Point end;

    public Line(Point start , Point end){
        this.start = start;
        this.end = end;
    }

    public Point getStart(){
        return start;
    }

    public Point getEnd(){
        return end;
    }

    //Line's vector
    public  Vector2D getVector(){
        Vector2D v =  end.subPoints(start);
        return v;
    }

    Magnitude m = new Magnitude();
    public double length(){
        double len = m.calMagnitude(getVector());
        return len;
    }
}
