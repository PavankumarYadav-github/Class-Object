package com.Legion;

import java.util.Random;
import java.util.Scanner;

 class game {
    int number=0;
    int userinput;
    int computergen ;

    public int getNumber(){
        return number;
    }


    public game(){
        Random R=new Random();
        computergen= R.nextInt(20);
       // System.out.println(a);
    }

    public void setUserInput(){
        Scanner S=new Scanner(System.in);
        userinput=S.nextInt();
        number++;
    }
    public boolean toCheck(){
       if(userinput==computergen){
           System.out.println("you have find it ");
           return  true;
       }
       else if(userinput>computergen){
           System.out.println("greater ");
       }
       else if(userinput<computergen){
           System.out.println("lower");
       }
       return false;
    }
}

public class guess {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        boolean a=false;
        game G = new game();
        while (!a) {
            G.setUserInput();
             a = G.toCheck();
            System.out.println(a);
        }
        int c=G.getNumber();
        System.out.println("No of guess "+c);
    }
}
