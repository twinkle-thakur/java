package Youtube;
import java.util.Scanner;
public class Sumofnno1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of N");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum+=i;
	}
	System.out.println("sum of natural no.upto "+n);
	System.out.println(sum);
	sc.close();
	}

}
