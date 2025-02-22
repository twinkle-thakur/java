package twinklethkur;

public class Unaryoperator4 {

	public static void main(String[] args) {
	int x=2;
	int y=3;
	++x;
	System.out.println(x);
	x=x+ y++;
	System.out.println(x);
	y=++y + x++;//4+6
	System.out.println(y);
	x= ++y*2;
			System.out.println(x);
	System.out.println(y);
	}

}
