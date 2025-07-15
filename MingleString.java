package string;

public class MingleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a="Hello";
    String b="World";
    int d,e;
    if(a.length()>b.length()) {
    	d=a.length();
    }
    else {
    	d=b.length();
    }
    for(int i=0;i<d;i++) {
    	char f=a.charAt(i);
    	char g=b.charAt(i);
    	System.out.print(f+""+g);
    }
	}

}
