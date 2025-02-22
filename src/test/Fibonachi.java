package test;

public class Fibonachi {
   static void fib(int n) {
	   int a=0,b=1,c;
	   
	  for(int i=0;i<n;i++) {
		  System.out.println(a);
		  c=a+b;
		  a=b;
		  b=c;
		 
	  }
   }
   void isContains(int n) {
	   
   }
	public static void main(String[] args) {
		fib(5);
	}

}
