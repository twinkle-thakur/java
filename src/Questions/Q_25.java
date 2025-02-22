package Questions;

public class Q_25 {

	public static void main(String[] args) {
		int a=27;
		if(a>=0) {
			int c=(int) Math.cbrt(a);
			if(c*c*c==a) {
				System.out.println("perfect cube root no.");
			}
			else
				System.out.println("not");
		}
	}

}
