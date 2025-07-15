package assignment2;


import java.util.Scanner;

class Box{
	int depth,breath,height;
	int volume;
	Box(int depth,int breath,int height) {
		this.height=height;
		this.depth=depth;
		this.breath=breath;
	}
	void show() {
		volume=(breath*depth*height);
		System.out.println(volume);
		//return volume;
		
	}
}

public class Boxvolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int breath=sc.nextInt();
		int depth=sc.nextInt();
		int height=sc.nextInt();
		
		Box v=new Box(depth,breath,height);
		v.show();
	//System.out.println(v.volume);
		
	}

}
