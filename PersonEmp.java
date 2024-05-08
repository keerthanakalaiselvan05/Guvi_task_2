package com.guvi.task2;
import java.util.Scanner;

class Person1
	{
	String name;
	int age;
	Person1(String name,int age)
	{		
		this.name=name;
		this.age=age;
		System.out.println("Name is : "+name+ " || " +" Age is : "+age);
	}
	}
	class Employee extends Person1
	{		
		public Employee(String name,int age,int empID,double salary){
			//super keyword to initialize the base class attributes
			super(name, age);
			System.out.println("Employee ID is : "+empID+ " || "+" Salary is : "+salary);
		}
	}
	public class PersonEmp {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name : ");
			String name = sc.nextLine();
			System.out.println("Enter Age : ");
			int age=sc.nextInt();
			System.out.println("Enter EmployeeID : ");
			int empID=sc.nextInt();
			System.out.println("Enter Salary : ");
			double salary=sc.nextDouble();
			Employee emp=new Employee(name,age,empID,salary);
	        sc.close();
		}
	}
	
/*
	 
Output:
	 
Enter Name : 
Keerthana
Enter Age : 
23
Enter EmployeeID : 
9612
Enter Salary : 
35000
Name is : Keerthana ||  Age is : 23
Employee ID is : 9612 ||  Salary is : 35000.0

*/
