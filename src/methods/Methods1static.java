package methods;

public class Methods1static {
	static int logic(int x,int y) {//static is used for not creating an obj
		int z;                     //static method is shared by all the objs
		if(x>y) {
			z=x+y;
		}
		else {
			z=(x+y)*5;
		}
		return z;
	}
	public static void main(String[] args) {
		int c=logic(4,6);
		int c1=logic(3,2);
		System.out.println(c);
		System.out.println(c1);
	}
}
