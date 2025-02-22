package Youtube;
import java.util.Scanner;
public class Practice {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("enter size of arary");
int size =sc.nextInt();
int a[]=new int[size];
System.out.println("enter values of arary");
for(int i=0;i<size;i++) {
	a[i]=sc.nextInt();
	}
System.out.println("arary before deletion:");
for(int i=0;i<size;i++) {
	System.out.print(a[i]+" ");
	}
System.out.println("enter location of array where element is to be deleted");
int loc=sc.nextInt();

for(int i=loc;i<size-1;i++) {
	a[i]=a[i+1];
	System.out.println(a[i]);
}


for(int i=0;i<a.length-1;i++) {
	System.out.print(a[i]);
}sc.close();
}
}
