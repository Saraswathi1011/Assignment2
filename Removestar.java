package string;

public class Removestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String a="*mem*";
     for(int i=0;i<a.length();i++) {
    	 char c=a.charAt(i);
    	 if(c!='*') {
    		 System.out.print(c);
    	 }
     }
	}

}
