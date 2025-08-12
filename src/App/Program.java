package App;

import Vector_Operations.*;
import Vector_Points.*;
import Drawing.*;

import javax.swing.*;

public class Program {
    public void run(){

        //---vector_points---

        //(FIRST VECTOR CREATION)
        Point p1 = new Point(200,300);
        Point p2 = new Point(100, 100);

        Vector2D v1;
        v1 = p1.subPoints(p2);
        System.out.println("VECTOR CREATED :"+v1);
        System.out.println("X component of a vector: "+ v1.getX());
        System.out.println("Y component of a vector is: "+ v1.getY());

        //(SECOND VECTOR CREATION)
        Point p3 = new Point(250,250);
        Point p4 = new Point(150, 150);

        Vector2D v2;
        v2 = p1.subPoints(p2);
        System.out.println("VECTOR CREATED :"+v2);
        System.out.println("X component of a vector: "+ v2.getX());
        System.out.println("Y component of a vector is: "+ v2.getY());


        //-----vector operations-----
        Addition sum = new Addition();
        System.out.println("SUM OF TWO VECTORS: "+sum.add(v1,v2));

        Subtraction diff = new Subtraction();
        System.out.println("DIFFERENCE OF TWO VECTORS: "+diff.sub(v1,v2));

        Product product = new Product();
        //dot product
        System.out.println("DOT PRODUCT OF TWO VECTORS: "+ product.dotProduct(v1,v2));
        //cross product
        System.out.println("CROSS PRODUCT OF TWO VECTORS: "+ product.crossProduct(v1,v2));

        Magnitude mag = new Magnitude();
        System.out.println("MAGNITUDE OF FIRST VECTOR: "+ v1);
        System.out.println("MAGNITUDE OF SECOND VECTOR: "+ v2);

        //---drawing---

        Line line1 = new Line(p1,p2);
        Line line2 = new Line(p3,p4);

        JFrame jFrame = new JFrame("Vectors");
        Canvas canvas = new Canvas(line1 , line2);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.add(canvas);



    }
}
