package Drawing;

import Vector_Points.*;
import Vector_Operations.*;

import java.lang.management.ManagementFactory;

public class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double calLength (){
        Magnitude mag = new Magnitude();
        Vector2D v = Vector2D.getVector(start,end);
        return mag.calMagnitude(v);
    }

}
