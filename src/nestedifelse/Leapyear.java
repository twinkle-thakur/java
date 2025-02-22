package nestedifelse;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter year");
int a=sc.nextInt();
System.out.println(a);
if(a%4==0)
{
	if(a%100==0)//to check if it is a centurian year
	{
		if(a%400==0)//to check centurian yera is a leap year
		{
			System.out.println("leap year");

		}
		else
		{
			System.out.println("not a leap year");

		}
	}else
	{
		System.out.println("leap year");

	}
}
else
{
	System.out.println("not a leap year");

}
sc.close();

	}

}
