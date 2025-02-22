package Youtube;

import java.util.Scanner;

public class Countdigit10 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter digit");
	int a=sc.nextInt();
	int count=0;
	for(int i=a;i>0;i=i/10) {
		count++;
	}
	System.out.println(count);
	sc.close();
	}

}
