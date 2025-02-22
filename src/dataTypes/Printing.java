package dataTypes;

public class Printing {
public static void main(String[] args) {
	int a=10,b=9;
	System.out.printf("sum of %d and %d is : %d \n" ,a,b,a+b );
	System.out.printf("sum of %4d and %d is : %d \n" ,a,b,a+b );
	float f=2.4f;
	System.out.printf("before formating %f \n",f );
	System.out.printf("After formating %.2f ",f );
}
}
