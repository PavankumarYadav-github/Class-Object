package com.Legion;

import java.awt.*;

class Circle{
    Point Center;
    double radius;

    Circle(){
        Center=new Point(0,0);
        radius=1;
    }
    Circle(Point Center,double radius){
        this.Center=Center;
        this.radius=radius;
    }

    double getArea(){
        return Math.PI*radius*radius;
    }
    double getParameter(){


        return 2*Math.PI*radius;
    }
    void setCenter(Point Center){
        this.Center=Center;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
}
public class NewMain {
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println(c1.Center);
        System.out.println(c1.radius);
        Point P=new Point();
        System.out.println(P);
    }
}
