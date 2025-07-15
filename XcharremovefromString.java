package string;

public class XcharremovefromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String input="XhiiX";
        for(int i=0;i<input.length();i++) {
        	char c=input.charAt(i);
        	if(c!='X'&&c!='x') {
        		System.out.print(c);
        	}
        }
	}

}
