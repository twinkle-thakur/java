      /*tax calc prg*/
//i/p sal<=10000---->no tax
//i/p sal>10000---->10%tax
//i/p sal>100000---->20%tax
package Youtube;

import java.util.Scanner;

public class Txaofsalary11 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
System.out.println("enter salary");
int s=sc.nextInt();
if(s<=10000) {
	System.out.println("no tax");	
}
else if(s>10000&&s<=100000) {
	double tax=0.1*s;
	System.out.println(tax);
}
else {
	double tax2=0.2*s;
	System.out.println(tax2);
}sc.close();
	}

}
