package com.Legion;

import java.util.Scanner;

class form{
    private String name ;
    private int age;
    private char gender;

    form(){
        name="please input";
        age=0;
        gender='n';
    }
    form(String x,int a,char c){
        name=x;
        age=a;
        gender=c;
    }
    public static
    void  setName(){
        Scanner S=new Scanner(System.in);
        String name=S.nextLine();
        int age=S.nextInt();
        char gender=S.next().charAt(0);
    }
    void output(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Gender :"+gender);
    }

}
public class Main3 {
    public static void main(String[] args) {
        form p1=new form();
        form p2=new form("ramesh",25,'M');
        p1.output();
        System.out.println();
        p2.output();
    }

}
