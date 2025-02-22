package twinklethkur;

public class Unaryoperator7 {

	public static void main(String[] args) {
		int x=2;
		int y=3;
		x=x+y+x++ +y++;
		System.out.println(x);System.out.println(y);
		y=x+y+x++ +y--;
		System.out.println(x);
		System.out.println(y);
	}

}
