package string;
import java.util.Scanner;
public class nrepeatstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=sc.nextInt();
        //int count=0;
        String b=" ";
        String count=a.substring(a.length()-n);
        for(int i=0;i<n;i++) {
        	b=b+count;
        }
        System.out.println(b+" ");
	}

}
