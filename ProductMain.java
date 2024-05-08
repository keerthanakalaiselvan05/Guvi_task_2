package com.guvi.task2;

import java.util.Scanner;

public class ProductMain {
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			//array
			Product[] products=new Product[5];
			//accept five information from user and store in an array
		    for(int i=0;i<5;i++)
		    {
		    	System.out.println("Enter details for product "+(i+1) + ":");
		        System.out.println("Product ID :");
		        int pid=sc.nextInt();
		        System.out.println("Price :");
		        int price=sc.nextInt();
		        System.out.println("Quantity :");
		        int quantity=sc.nextInt();
		        products[i]=new Product(pid,price,quantity);
		    }
		    int highestPricePid=findhighestPriceProduct(products);
		    System.out.println("Product with highest price has ID : "+highestPricePid);
		    double totalAmountSpent=calculateTotalAmountSpent(products);
		    System.out.println("Total amount spent on all products : "+totalAmountSpent);
		    sc.close();
		  }
			//method to find product with highest price
		 static int findhighestPriceProduct(Product[] products)
		 {
			 if(products==null || products.length==0)
				 System.out.println("Product array is empty");
			 int highestPricePid=products[0].getPid();
			 double highestPrice=products[0].getPrice();
			 for(int i=1;i<products.length;i++)
			 {
				 if(products[i].getPrice()>highestPrice)
				 {
					 highestPrice=products[i].getPrice();
					 highestPricePid=products[i].getPid();
				 }
			 }
			 return highestPricePid;
		 }
		 //method to calculate and return the total amount spent on all products
		 static double calculateTotalAmountSpent(Product[] products) {
			 if(products==null || products.length==0)
				 System.out.println("Product array is empty");
			 double totalAmountSpent=0;
			 for(Product product : products)
			 {
				 totalAmountSpent+=product.getPrice()*product.getQuantity();
			 }
			 return totalAmountSpent;
		 }
	}

/*

Output:

Enter details for product 1:
Product ID :
1
Price :
200
Quantity :
5
Enter details for product 2:
Product ID :
2
Price :
541
Quantity :
3
Enter details for product 3:
Product ID :
3
Price :
982
Quantity :
6
Enter details for product 4:
Product ID :
4
Price :
352
Quantity :
7
Enter details for product 5:
Product ID :
5
Price :
485
Quantity :
1
Product with highest price has ID : 3
Total amount spent on all products : 11464.0

*/