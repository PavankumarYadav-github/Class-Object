package com.Legion;

import java.util.Scanner;

class Cylinder{
    private int radius;
    private int height;

    Cylinder(){
        radius=0;
        height=0;
    }

    Cylinder(int Radius ,int Height){
        radius=Radius;
        height=Height;
    }

    public void setRadius() {
        System.out.println("Enter radius of Cylinder ");
        radius= new Scanner(System.in).nextInt();
    }
    public void setHeight(){
        System.out.println("Enter height  of Cylinder ");
        height=new Scanner(System.in).nextInt();
    }


    public int  getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }

    public float surfaceArea(){
        return 2*3.142f*radius*height+2*3.142f*radius*radius;
    }
    public  double volume(){
        return Math.PI*radius*radius*height;
    }

    public float spear(){
        return 4*3.142f*radius*radius;
    }

}

class Rectangle1{
    private int length;
    private int breath;

    Rectangle1(){
        length=0;
        breath=0;
    }
    Rectangle1(int Length,int Breath){
        length=Length;
        breath=Breath;
    }
    public void set(){
        length=new Scanner(System.in).nextInt();
        breath=new Scanner(System.in).nextInt();

    }
    public void get(){
        System.out.println("Length :"+length);
        System.out.println("Breath :"+breath);
    }

}

public class MainExercise {
    public static void main(String[] args) {
        Cylinder C=new Cylinder();
        System.out.println(C.getRadius());
        System.out.println(C.getHeight());


        Cylinder C1=new Cylinder(5,8);
        System.out.println("Radius : "+C1.getRadius());
        System.out.println("Height : "+C1.getHeight());
        System.out.println("Spear :"+C1.spear());
        System.out.println("Surface Area of Cylinder is :"+C1.surfaceArea());
        System.out.println("Volume of Cylinder is :"+C1.volume());
        System.out.println();


        Rectangle1 R=new Rectangle1();
        R.get();
        Rectangle1 R1=new Rectangle1(5,10);
        R1.get();
        R1.set();
        R1.get();
    }
}
