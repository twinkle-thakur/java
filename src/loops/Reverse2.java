package loops;

public class Reverse2 {

	public static void main(String[] args) {
		int num=1234;
		for(int i=num;i>0;i=i/10)
		{
			int digit=i%10;
			System.out.print(digit);
		}
	}

}
