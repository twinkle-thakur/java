//there are two conditions for a year to be leapyear
//1)century(100%=0&&400%=0)---->2000 2400 but 1700 1800 r not
//2)yearly(100%!=0&&4%=0)---->2020  2024  but 2021 2022 r not
package Youtube;

import java.util.Scanner;

public class Leapyear13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year ");
		int a=sc.nextInt();
		if((a%100==0&&a%400==0)||(a%100!=0&&a%4==0)) {
			System.out.println("leap year");
		}else {
			System.out.println("not");
		}sc.close();
	}

}
