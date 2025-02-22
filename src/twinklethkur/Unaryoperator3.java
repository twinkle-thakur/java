package twinklethkur;

public class Unaryoperator3 {

	public static void main(String[] args) {
		int x=2;
		int y=3;
		x++;//3
		y=--y;//2
		x=x++ + --y + ++x;//4+1+3=8
		y=y+x+ x-- + y++;//2+8+7+3=20
		System.out.println(x);
		System.out.println(y);
	}

}
