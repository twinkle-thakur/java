package Ifelse;

import java.util.Scanner;

public class Program5P {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter week");
int a=sc.nextInt();
System.out.println(a);
if(a==1)
{
	
	System.out.println("monday");

}
else if(a==2)
{
	System.out.println("tues");
}
else if(a==3)
{
	System.out.println("wed");
	
}
else if(a==4)
{
	System.out.println("thurs");
	
}
else if(a==4)
{
	System.out.println("wrong choice");
	
}
else if(a==5)
{
	System.out.println("sat");
	
}
else if(a==6)
{
	System.out.println("sun");
	
}
else
{
	System.out.println("sun");
	
}
sc.close();
	}

}
