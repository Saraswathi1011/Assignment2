package assignment2;

import java.util.Scanner;

public class Calculator {
	
	public static int  powerInt(int num1,int num2) {
		return (int)Math.pow(num1,num2);
	}
	
	public static double powerDouble(double num3,int num2) {
		return Math.pow(num3, num2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		double num3=sc.nextDouble();
		
		int  res1=powerInt(num1,num2);
		double res2=powerDouble(num3,num2);
		
		System.out.println("Power Int : " + res1);
		System.out.println("Power Double : " + res2);
	}

}
