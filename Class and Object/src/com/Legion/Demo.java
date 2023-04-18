package com.Legion;

public class Demo {//Class
    int a=120;//fields
    String b="Hello World";//field

    void show(){//method
        System.out.println(a+" "+b);
    }


}
class test{//class
    public static void main(String[] args) {//main method
        Demo a=new Demo();//creating object of demo class
        a.show();//calling method of demo class in main method by creating object
    }
}
