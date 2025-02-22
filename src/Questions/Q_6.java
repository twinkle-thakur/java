package Questions;

import java.util.Scanner;

public class Q_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter year");
		int year=sc.nextInt();
		if((year%100==0&&year%400==0)||(year%100!=0&&year%4==0)) {
			System.out.println(year+" is a leap year");
		}sc.close();
	}

}
