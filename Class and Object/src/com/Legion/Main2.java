package com.Legion;
class Empl{

    private String name;
    private int id;
    private int  salary;

    public Empl(){
    name="Name";
    id=0;
    }
    public Empl(String a,int b){
        name=a;
        id=b;
    }
    public Empl(String a,int b,int c){
        name=a;
        id=b;
        salary=c;
    }
    void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    public void setName(String a,int b){
        name=a;
        id=b;
    }
    public void  setData(String a,int b){
        name=a;
        id=b;
    }
}

public class Main2{
    public static void main(String[] args) {
        Empl E3=new Empl();
        Empl E2=new Empl("Ramesh",55);
        Empl E4=new Empl("Suresh",25,10000);
        //E2.name="pavan";
        //E2.id=25;
//        E2.setData("pavan",25);
//        E2.display();
//        E3.setName("Ramesh",30);
//        E3.display();
        E2.display();
        E3.display();
        E4.display();
    }
}
