package com.Legion;


 class AddTwo{

    int a;
    int b;

     public int add(int x,int y){
        return x+y;
    }
}
public class Add{
    public static void main(String[] args) {
        AddTwo A =new AddTwo();
        A.a=10;
        A.b=20;

        int c=A.add(10,20);
        System.out.println(c);
        //System.out.println(A.add(A.a,A.b));
    }
}
