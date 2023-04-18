package com.Legion;

class Employee1{
    String name;
    int id;
    int Salary;
    

    void Display(){
        System.out.println("Name:-"+name);
        System.out.println("ID:-"+id);
        System.out.println("Salary:-"+Salary);
    }
}
public class Main {
    public static void main(String[] args) {
       Employee1 E1=new Employee1();
       Employee1 E2=new Employee1();

       E1.name="Ramesh";
       E1.id=2564;
       E1.Salary=25000;

       E2.name="Suresh";
       E2.id=2567;
       E2.Salary=50000;

       E1.Display();
        System.out.println();
       E2.Display();

    }
}
