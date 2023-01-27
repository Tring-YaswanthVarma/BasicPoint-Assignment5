package org.example;
import java.util.*;

public class BasicPoint implements Cloneable{
    private final double x;
    private final double y;

    BasicPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public boolean checkEqual(BasicPoint newPoint){
        return this.x == newPoint.x && this.y == newPoint.y;
    }

    @Override
    public BasicPoint clone() throws CloneNotSupportedException {
        return (BasicPoint) super.clone();
    }
}

class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
        double x;
        double y;
        String check;
        Scanner sc = new Scanner(System.in);
        Logger l = Logger.getLogger("com.api.jar");
        l.info("Enter coordinates for first point.");
        l.info("Enter x : ");
        x = sc.nextDouble();
        l.info("Enter y : ");
        y = sc.nextDouble();
        BasicPoint bp1 = new BasicPoint(x,y);
        l.info("Enter coordinates for second point");
        l.info("Enter x : ");
        x = sc.nextDouble();
        l.info("Enter y : ");
        y = sc.nextDouble();
        BasicPoint bp2 = new BasicPoint(x,y);
        l.info("Before cloning");
        check = "Objects bp1 and bp2 are equal : " + bp1.checkEqual(bp2);
        l.info(check);
        l.info("After cloning");
        bp2 = bp1.clone();
         String s = "Objects bp1 and bp2 are equal : " + bp1.checkEqual(bp2);
        l.info(s);
    }
}