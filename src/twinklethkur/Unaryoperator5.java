package twinklethkur;

public class Unaryoperator5 {

	public static void main(String[] args) {
	int y=5;
	int x=2;
	y=y+ x++;//5+3=8
	x=y-- * x--;//7*1=7
	System.out.println(x);
	System.out.println(y);
	y=y++;//9
	System.out.println(y);
	x=x--;//6
	System.out.println(x);
	x=x+y+ x++ * y--;
	
	System.out.println(x);
	System.out.println(y);
	}

}
