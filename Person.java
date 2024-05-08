package com.guvi.task2;

import java.util.Scanner;

public class Person {

		static String name;
		static int age;
		
		//method to print name and age
		
		void show(String name,int age)
		{
			Scanner sc=new Scanner(System.in);
			name=sc.nextLine();
			age=sc.nextInt();
			System.out.println("Name is : "+name+" || "+" Age is : "+age);
			sc.close();
		}
		public static void main(String[] args) {
			Person p=new Person();
	        p.show(name,age);
		}
	}

/*
Output:

Keerthana
18
Name is : Keerthana ||  Age is : 18

*/