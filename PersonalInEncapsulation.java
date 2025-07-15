package assignment2;

import java.util.Scanner;

class Author{
	 private String name;
	private String mail;
	private char gender;
	Author(String name,String mail,char gender){
		this.name=name;
		this.mail=mail;
		this.gender=gender;
	}
	void name() {
		System.out.println("Name is "+name+" with the mail id of "+mail+" and gender is "+gender);
	}
	
}

public class PersonalInEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		String mail=sc.nextLine();
		char gender=sc.next().charAt(0);
		
		Author s=new Author(name,mail,gender);
		s.name();
		
	}

}
