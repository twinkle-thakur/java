package loops;

import java.util.Scanner;

public class Armstrong_2 {
    public static boolean isArmstrong(int num) {
    	int noOfdigit=count(num);
    	int finalNo=0;
    	int a=num;
    	while(num>0) {
    		int digit=num%10;
    		finalNo+=pow(digit,noOfdigit);
    		num/=10;
    	}
    	return a==finalNo;
    }
    public static int count(int num) {
    	int count=0;
    	while(num>0) {
    		count++;
    		num/=10;
    	}
    	return count;
    }
    public static int pow(int num1,int num2) {
    	int result=1;
    	int i=1;
    	while(i<=num2) {
    		result*=num1;
    		i++;
    	}
    	return result;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. ");
		int num=sc.nextInt();
		
		if(isArmstrong(num)) {
			System.out.println("your no. armstrong");
		}
		else
			System.out.println("your no. is not armstrong");
	}

}
