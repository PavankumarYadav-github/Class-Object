package com.Legion;

import java.util.Scanner;

/*public class Student {
    String  name="Student ";
    int rollno=25;

    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.name);
        System.out.println(s1.rollno);
    }
}*/
class add{

    int a ;
    int b ;

    public  int print(int a, int b){
        return a+b;
    }
}
public class Student {
    public static void main(String[] args) {

        add sum1=new add();//add class sum1 object
        add sum2=new add();//add class sum2 object
        add Sum3=new add();
        Scanner n=new Scanner(System.in);

        //sum1
        sum1.a=10;
        sum1.b =20;
        int c=sum1.print(sum1.a, sum1.b );
        System.out.println(c);

        //sum2
        sum2.a=50;
        sum2.b=50;
         int c1=sum2.print(sum2.a, sum2.b);
        System.out.println(c1);

        Sum3.a=20;
        Sum3.b=50;
        int c3=Sum3.print(Sum3.a,Sum3.b);
        System.out.println(c3);

    }
}