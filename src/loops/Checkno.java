package loops;
import java.util.Scanner;
public class Checkno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. :");
		int a=sc.nextInt();
		System.out.println(a);
if(a>0)
{
	for(int i=1;i<=a;i++)
	{
		System.out.println(i);

	}
}
 if(a<0)
{
	for(int i=a;i<=-1;i++)
	{
		System.out.println(i);

	}
}

	}

}
