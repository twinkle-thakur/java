package twinklethkur;

public class Swap2 {

	public static void main(String[] args) {
		int a=6;
		int b=8;
		System.out.println("before swap a= "+a);
		System.out.println("before swap b= "+b);
		b=b-a;
		a=a+b;
		b=a-b;
		System.out.println("after swap a= "+a);
		System.out.println("after swap b= "+b);
	
	}

}
