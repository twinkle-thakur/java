package loops;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter no. :");
int a=sc.nextInt();
boolean check=true;
for(int i=2;i<a;i++)
{
	if(a%i==0)
	{
		check=false;
		break;
	}
}
if(check)
{
	System.out.println("prime no. ");
}
else if(a<=1)
{
	System.out.println("not prime ");
}
else
{
	System.out.println("not prime");
}
sc.close();
	}
}

