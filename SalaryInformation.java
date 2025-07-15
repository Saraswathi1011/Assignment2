package assignment2;


import java.util.Scanner;

class Person{
	private String name;
	
	Person(String name){
		this.name=name;
	}
	 public String name(){
		 return name;
	 }
}

class Employee extends Person{
	private int salary;
	private int year;
	private String insurance;
	
	Employee(String name,int year,int salary,String insurance){
		super(name);
		this.year=year;
		this.salary=salary;
		this.insurance=insurance;
	}
	public int salary() {
		return salary;
		
	}
	public String insurance() {
		return insurance;
	}public int year() {
		return year;
	}
}
public class SalaryInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Name: ");
		String name=sc.nextLine();
		System.out.println("Year: ");
		int year=sc.nextInt();
		System.out.println("Salary; ");
		int salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Insurance id: ");
		String insurance=sc.nextLine();
		
		Employee k=new Employee( name, year,salary,insurance);
		System.out.println("Name of employee: "+k.name());
		System.out.println("Year of join:  "+k.year());
		System.out.println("Annual Salary: "+k.salary());
		System.out.println("Insurance id: "+k.insurance());
		
		
		
	}

}
