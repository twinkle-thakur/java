package loops;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter X :");
		int x=sc.nextInt();
		System.out.println(x);

		System.out.println("enter Y :");
		int y=sc.nextInt();
		System.out.println(y);


		int result=(int) Math.pow(x,y);
		System.out.println(x+"^"+y+" is "+result);
sc.close();
	}

}
