package methods;

public class Factorial {
	public int fact(int num)
	{
		if(num==0) {
			return 1;
		}
		else {
			return num*fact(num-1);
		}
	}
public static void main(String[] args)
{
	Factorial f=new Factorial();
	System.out.println(f.fact(5));
}
}
