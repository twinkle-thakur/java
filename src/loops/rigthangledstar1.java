package loops;

public class rigthangledstar1 {

	public static void main(String[] args) {
		int space=4;
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		space--;
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}}	