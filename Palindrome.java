package string;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b = a.replaceAll("\\s", "").toLowerCase();
        int left=0;
        int flag=0;
        int right=b.length()-1;
        while(left<right) {
        	if(b.charAt(left)!=b.charAt(right)) {
        		flag=1;
        		break;
        	}
        	left++;
        	right--;
        }
        if(flag==0) {
        	System.out.println("Palindrome");
        }
        else {
        	System.out.println("Not palindrome");
        }
	}

}
