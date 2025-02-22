package Ifelse;
import java.util.Scanner;
public class Luckyno {

	public static void main(String[] args) {
		System.out.println("enter a 4 digit no. : ");//3719
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int a1 =a%10;//9
		int a2 =(a/10)%10;//1
		int a3 =(a/100)%10;//7
		int a4 =(a/1000)%10;//3
		if(a1+a2==a3+a4) {
			System.out.println("lucky no. ");
		}
		else
			System.out.println("not lucky no.");
	}

}
