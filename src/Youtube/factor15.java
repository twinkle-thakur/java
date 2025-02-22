//i/p  10--->1,2,5,10are factors of 10
package Youtube;

import java.util.Scanner;

public class factor15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				System.out.print(i+" ");
			}
		}sc.close();
	}

}
