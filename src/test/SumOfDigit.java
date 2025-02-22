package test;

public class SumOfDigit {
   static int sum(int n) {
    	int sum=0;
    	for(int i=n;i>0;i=i/10) {
    		sum+=i%10;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		System.out.println(sum(352));
	}

}
