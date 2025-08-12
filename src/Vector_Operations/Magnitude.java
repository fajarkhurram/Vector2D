package Vector_Operations;

import Vector_Points.Vector2D;

public class Magnitude {

    //using NEWTON-RAPHSON METHOD TO CALCULATE ROOT(we're not using built-in method)

    // SquareRoot = (guess+ value/guess)/2.0

    public double mySqrt(double value){
        if(value == 0){
            return 0;
        }
        double guess = value / 2.0 ;  //initial guess

        for(int i = 0 ; i < 10 ; i++){
            guess = (guess + value/ guess) / 2.0;
        }
        return guess;
    }

    public double calMagnitude(Vector2D v){
        double mag = v.getX()*v.getX() + v.getY()*v.getY();
        return mySqrt(mag);
    }
}
