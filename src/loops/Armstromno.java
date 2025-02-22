package loops;

import java.util.Scanner;

public class Armstromno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. : ");
		int a=sc.nextInt();
		System.out.println(a);
		int count=0;
		for(int i=a;i>0;i=i/10);
		{
			count++;
		}
		int ans=0;
		for(int i=a;i>0;i=i/10)
		{
			int digit=i%10;
			 ans = (int)(ans+Math.pow(digit, count));
					
		}
		System.out.println(ans);
		if(a==ans)
			
		{
			System.out.println(a +" is armstrong no. ");
		}
		else
		{
			System.out.println("not armstrong");
		}
		sc.close();
	}

}
