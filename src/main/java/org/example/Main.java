package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

class Main {
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
        BasicPoint bp1 = new BasicPoint(x, y);
        l.info("Enter coordinates for second point");
        l.info("Enter x : ");
        x = sc.nextDouble();
        l.info("Enter y : ");
        y = sc.nextDouble();
        BasicPoint bp2 = new BasicPoint(x, y);
        l.info("Before cloning");
        check = "Objects bp1 and bp2 are equal : " + bp1.checkEqual(bp2);
        l.info(check);
        l.info("After cloning");
        bp2 = (BasicPoint) bp1.clone();
        String s = "Objects bp1 and bp2 are equal : " + bp1.checkEqual(bp2);
        l.info(s);
    }
}
