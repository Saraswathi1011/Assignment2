package string;
import java.util.Scanner;
public class TwocharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int sum=0;
        while(sum<a.length()) {
        	System.out.print(a.charAt(0)+""+a.charAt(1));
        	sum++;
        }
        System.out.println();
        
	}

}
