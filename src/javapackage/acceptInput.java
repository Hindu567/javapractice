package javapackage;

import java.util.Scanner;

public class acceptInput {

	public static void main(String[] args) {
		
		
		 int a,b,sum,product;
	        Scanner scan=new Scanner(System.in);
	        System.out.println("Enter the First No:");
	        a=scan.nextInt();
	        System.out.println("Enter the Second No:");
	        b=scan.nextInt();
	        sum=a+b;
	        product=a*b;
	        System.out.println("Sum="+sum);
	        System.out.println("Product="+product);

	}

}
