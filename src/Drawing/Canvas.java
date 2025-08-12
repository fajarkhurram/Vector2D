package Drawing;

import javax.swing.*;
import java.awt.*;


public class Canvas extends JPanel {
    private Line line1;
    private Line line2;

    public Canvas(Line l1 , Line l2){
        this.line1 = l1;
        this.line2 = l2;
    }




    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //Draw first line
        g.drawLine((int)line1.getStart().getX(),(int)line1.getStart().getY(),(int)line1.getEnd().getX(),(int)line1.getEnd().getY());

        //Draw second line
        g.drawLine((int)line2.getStart().getX(),(int)line2.getStart().getY(),(int)line2.getEnd().getX(),(int)line2.getEnd().getY());
    }
}
