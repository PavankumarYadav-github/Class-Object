package com.Legion;

class employee{
    String name;
    int salary;

    public void setName(String n){
        name=n;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

}

class Square{
    int side;

    public int area(){
        return side*side;
    }

    public int parameter(){
        return 4*side;
    }
    public void getside(int n){
        side=n;
    }
}
class rectangle {
    int l;
    int b;


    public int area(){
        System.out.print("Area Of rectangle ");
        return l*b;
    }
    public int parameter(){
        return 2*(l+b);
    }
}

class circle {
    int radius;

    public void setradius(int n){
        radius =n;
    }
    public double area(){
        System.out.println("Area of circle ");
        return 3.142*(radius*radius);
    }
    public double parameter(){
        System.out.println("Parameter of circle ");
        return 2*(3.14*radius);
    }

}
public class E1 {
    public static void main(String[] args) {
        //Employee class
       employee Ep1=new employee();
        employee Ep2=new employee();


        Ep1.name="heloo";
        Ep1.setName("Ramesh");
        System.out.println("name-"+Ep1.getName());
        Ep1.salary=25000;
        System.out.println(Ep1.getSalary());

        System.out.println(Ep2.getName());

        //Square class
        Square sq=new Square();
        sq.side=5;

        sq.getside(7);
        int a=sq.area();
        System.out.println("Area "+sq.area());
        int b=sq.parameter();
        System.out.println("Area of Square "+a+" Parameter of Square "+b);

        sq.getside(5);
        sq.area();
        System.out.println("Area of Squareb "+sq.area());
        System.out.println("Parameter  of Square  "+sq.parameter());


        //Rectangle class
        rectangle R=new rectangle();
        R.l=5;
        R.b=10;
        System.out.println(R.area());
        int c=R.parameter();
        System.out.println("Parameter is "+c);

        //Circle  class
        circle C=new circle();
        C.setradius(61);
        System.out.println( C.area());
        System.out.println(C.parameter());
        C.radius=10;
        C.setradius(10);
        System.out.println(C.area());
        System.out.println(C.parameter());

    }
}
