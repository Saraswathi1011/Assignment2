package assignment2;

import java.util.Scanner;

class Person{
	private String name1;
	private String dateofbirth;
void check(String name,String dateofbirth) {
	this.name1=name1;
	this.dateofbirth=dateofbirth;
	
}
void display() {
	System.out.println("Student Detail....");
	System.out.println("Student name : "+name1);
	System.out.println("Date of Birth :"+dateofbirth);
}
}

class Teacher extends Person{
	private double salary;
	private String subject;
	private String name2;
	
	void teachcheck(double salary,String subject,String name2) {
		this.salary=salary;
		this.subject=subject;
		this.name2=name2;
	}
	void teachshow() {
		System.out.println("Teacher Detail....");
		System.out.println("Salary : "+salary);
		System.out.println("Subject : "+subject);
		System.out.println("Teacher Name : "+name2);
		System.out.println();
	}
}

class Student extends Person{
	private String studentsID;
	
	void stucheck(String studentID) {
		this.studentsID=studentID;
	}
	void stushow() {
		
		System.out.println("Student ID : "+studentsID);
		System.out.println();
	}
}

class College extends Student {
	private String collegename;
	private String year;
	
	void collegecheck(String collegename,String year) {
		this.collegename=collegename;
		this.year=year;
	}
	
	void collegeshow() {
		System.out.println("College Detail....");
		
		System.out.println("College Name : "+collegename);
		System.out.println("Year : "+year);
		
	}
	
}
public class FinalMethod {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Name : ");
		String name1=sc.nextLine();
		System.out.println("Name : ");
		String name2=sc.nextLine();
		System.out.println("Date of Birth : ");
		String dateofbirth=sc.nextLine();
		System.out.println("Student ID : ");
		String studentsID=sc.nextLine();
		System.out.println("Salary : ");
		double salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("Subject : ");
		String subject=sc.nextLine();
		System.out.println("College Name : ");
		String collegename=sc.nextLine();
		System.out.println("Year : ");
		String year=sc.nextLine();
		
		Person p=new Person();
		p.check(name1, dateofbirth);
		p.display();
		Person k=new Student();
		((Student) k).stucheck(studentsID);
		((Student) k).stushow();
		Person m=new Teacher();
		((Teacher) m).teachcheck(salary,subject,name2);
		((Teacher) m).teachshow();
		Student l=new College();
		((College) l).collegecheck(collegename,year);
		((College) l).collegeshow();
		
		
	sc.close();	
			

	}

}
