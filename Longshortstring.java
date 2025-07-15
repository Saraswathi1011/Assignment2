package string;

public class Longshortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String a="hello";
        String b="hii";
        int c=a.length();
        int d=b.length();
        if(c<d) {
        	System.out.print(a+""+b+""+a);
        }
        else {
        	System.out.println(b+""+a+""+b);
        }
	}

}
