package Youtube;

import java.util.Scanner;

public class Sumofoddeven3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr range n");
		int n=sc.nextInt();
		int sume=0;
		int sumo=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0) {
				sume+=i;
			}
			else {
				sumo+=i;
			}
		}
		System.out.println("sum of even no b/n 0-"+n+" is "+sume);
		System.out.println("sum of odd no b/n 0-"+n+" is "+sumo);
		sc.close();
	}

}
