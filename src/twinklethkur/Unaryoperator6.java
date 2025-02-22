package twinklethkur;

public class Unaryoperator6 {

	public static void main(String[] args) {
	int x=2;
	int y=3;
	x= x+x-- + --y + y++;
	System.out.println(x);
	System.out.println(y);
	y=x++;
	System.out.println(x);
	System.out.println(y);
	x=x++/2;
	System.out.println(x);
	x=x++/2 + --x*y + y--;
	System.out.println(x);
	System.out.println(y);
	y=x+1+x--;
	System.out.println(x);
	System.out.println(y);
	
	}

}
