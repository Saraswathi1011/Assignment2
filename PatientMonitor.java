package assignment2;

import java.util.Scanner;

class Patient{
	String name;
	double weight;
	double height;
	double result;
	
	double BMI() {
		result=weight/(height*height);
		return result;
	}
}
public class PatientMonitor {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		double height=sc.nextDouble();
		double weight=sc.nextDouble();
		
		Patient b=new Patient();
		b.name=name;
		b.height=height;
		b.weight=weight;
		
		System.out.println("BMI of " + b.name + " is: " + b.BMI());
	}

}
