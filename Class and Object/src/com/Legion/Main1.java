package com.Legion;

import java.lang.reflect.Parameter;

/*
class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }
    public void setId(int n){
        id=n;
    }
    public int getId(){
        return id;
    }


}
public class Main1 {
    public static void main(String[] args) {
        MyEmployee Employee1 =new MyEmployee();
        //Employee1.id=25;
        // Employee1.name="ramesh";
        Employee1.setName("Ramesh ");
        System.out.println(Employee1.getName());
        Employee1.setId(25);
        System.out.println(Employee1.getId());

    }
}
*/
class Circle1{
    private int radius ;
    private float area;
    private float para ;

    public float calculatearea(){
        return  3.142f*radius*radius;
    }

    public float calculateparameter(){
        return 3.142f*2*radius;
    }

    public void setRadius(int n){
        radius =n;
    }

    public void setArea(float a){
        area=3.142f*radius*radius;
        if(a==area) {
            area = a;


            System.out.println("value "+area);
        }
        else
            System.out.println("Wrong Area");
    }

    public void setParameter(float p){
        para=2*3.142f*radius;
        if(p==para){
            para=p;
            System.out.println("value "+para);
        }
        else
            System.out.println("WRONG PARAMETER ");
    }
}
public class Main1 {
    public static void main(String[] args) {


        Circle1 c=new Circle1();
        c.setRadius(5);
        c.setArea(c.calculatearea());
        c.setParameter(c.calculateparameter());

        c.setRadius(10);
        c.setParameter(25.24f);
        c.setArea(25.22f);
    }
}