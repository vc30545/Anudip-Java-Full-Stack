package com.company;

//Write a java program which accepts the data fields name of class employee ,employee name,
// salary as well as location and initialise the fields using Constructor.

import java.util.Scanner;

class Employee{
    static String employee_name;
    static int salary ;
    static int  emp_id;
    Employee(String str, int eid) {
        employee_name = str;
        emp_id = eid;
    }
    Employee(String str, int eid, int sala) {
        employee_name = str;
        emp_id = eid;
        salary = sala;
    }
    void display(){
        System.out.println("EMPOYEE Details"+"\n Employee name is : "+employee_name+ " \n Employee Id : " +emp_id );
    }
    void disp(){
        System.out.println("Employee Data With Salary"+"\n Employee name is : "+employee_name+ " \n Employee Id : " +emp_id + " \n Salary : "+ salary);
    }
}

public class ConstructData {

    public static void main(String[] args) {
        System.out.println("Construct Overloading");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name & ID & SALARY ");
        String name = sc.next();
        int id= sc.nextInt();
        int sal = sc.nextInt();
        Employee v1 = new Employee(name,id);
        v1.display();
        System.out.println();
        Employee v2 = new Employee(name,id,sal);
        v2.disp();



    }
}
////////////////////////////output/////////////////////////
Construct Overloading
Enter a name & ID & SALARY 
vishl
50
155005
EMPOYEE Details
 Employee name is : vishl 
 Employee Id : 50

Employee Data With Salary
 Employee name is : vishl 
 Employee Id : 50 
 Salary : 155005
