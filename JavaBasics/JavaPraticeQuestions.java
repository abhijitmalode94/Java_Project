package JavaBasics;

import java.util.Scanner;

public class JavaPraticeQuestions {

	public static void main(String[] args) {
		//Write a Java program to print the sum of two numbers.
		//1 way
		
		int a=10;
		int b=20;
		
		int sum=a+b;
		System.out.println("The sum of a and b is "+sum);
		
		//2 way
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first number -");
		
		int num1=input.nextInt();
         System.out.println("Enter the second number -");
		
		int num2=input.nextInt();
		
		int num3= num1+num2;
		System.out.println("Sum of two number is"+num3);
		

	}
	
	
	
	
	
}
