package string;
import java.util.Scanner;
public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=a.replaceAll(","," ").toLowerCase();
        System.out.println(b);
	}

}
