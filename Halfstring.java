package string;
import java.util.Scanner;
public class Halfstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int sum=0;
        int b=a.length()/2;
        if(a.length()%2==0) {
        	while(sum<b) {
        	//int b=a.length()/2;
        	System.out.print(a.charAt(sum));
        	sum++;
        }
	}
        else {
        	System.out.println("null");
        }
	}

}
