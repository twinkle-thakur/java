package loops;
import java.util.Scanner;
class Palindromno {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no. : ");
    int a=sc.nextInt();
	System.out.println(a);
	int result=0;
	for(int i=a;i>0;i=i/10)
	{
		 int ans=i%10;
		result=(result*10)+ans;
	}
	if(result==a)
	{
		System.out.println("palindrome no. ");
	}
	else
	{
		System.out.println("not prlindrome no. ");
	}
	sc.close();
	}

}
