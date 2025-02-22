package test;

public class Factorial {
    public  static int fact(int n) {
    	if(n==0||n==1) {
    		return 1;
    	}
    	else {
    		int fact=1;
    		for(int i=n;i>0;i--) {
        		fact*=i;
        		
        	}
    		return fact;
    	}
    	
		
    	
    }
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
