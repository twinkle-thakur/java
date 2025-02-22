package Questions;
import java.util.Scanner;
public class Q_30_imp {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enetr no. ");
int a=sc.nextInt();
int fact=1;
int sum=0,r;
for(int i=a;i>0;i=i/10) {
	 r=i%10;
	for(int j=r;j>0;j--) {
		fact=fact*j;
		System.out.println(fact);
	}
	sum+=fact;
}
if(a==sum) {
	System.out.println("strong no.");
}
else
	System.out.println("not a strong no. ");
sc.close();
}

}
