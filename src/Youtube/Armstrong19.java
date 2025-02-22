//153=1^3+5^3+3^3 where 3(pow) is no of digit
package Youtube;
import java.util.Scanner;
public class Armstrong19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no. ");
		int a=sc.nextInt();
	    int count=0;
	    int sum=0;
	    int c=a;
	    for(int i=a;i>0;i=i/10) {
	    	count++;
	    }
	    for(int i=a;i>0;i=i/10) {
	    	int r=i%10;
	    	sum+=(int) Math.pow(r,count);
	    }
	    if(sum==c) {
	    	System.out.println("arm");
	    }
	    else
	    	System.out.println(" not arm");
		sc.close();
	}

}
