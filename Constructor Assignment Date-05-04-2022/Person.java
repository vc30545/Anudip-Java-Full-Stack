package com.company;
//Write a program where we will do not create any constructor in the class.
//Suppose we have a class ‘Person’. A person has three major properties like name, age, and address,
// where the name, age, and address are instance variables declared inside the class.
public class Person {
    String name, address;
    int age;
    void detailswithoutconst(){
        System.out.println("Name: "+name +"\nAddress: "+address +"\nage: "+22);
    }
    void printpersoninfo(String n, String add, int age){
        System.out.println("name : "+n);
        System.out.println("address :"+add);
        System.out.println("age :"+age);

    }

    public static void main(String[] args) {
        Person p1 =new Person();
        p1.name ="Vishal";
        p1.address= "Ghodbunder Road,Thane,Mumbai 420351";
        p1.age=20;

        System.out.println(p1.name);
        p1.detailswithoutconst();
        System.out.println("*******************************");
        p1.printpersoninfo("Akshay","Ger Road,Vashi, 4201",28);
    }
}
