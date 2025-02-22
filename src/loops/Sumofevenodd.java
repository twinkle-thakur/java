package loops;

public class Sumofevenodd {

	public static void main(String[] args) {
		 System.out.print("Enter any Number:");
	        int x = sc.nextInt();
	        int ans = 0;
	        int ans1 = 0;
	        int n = 0;
	        int m = 0;
	        for (int i = 1; i <= x; i++) {
	            if (i % 2 == 0) {
	                n = n+1;
	                ans1 += i;

	            }
	        }
	        for (int i = 1; i <= x; i++) {
	            if (i % 2 == 1) {
	                m = m + 1;
	                ans += i;

	            }
	        }
	            System.out.println("Sum of the Even Number = " + ans1);
	        System.out.println("Sum of the Odd Number = " + ans);
	        System.out.println("Average of the Even Number = " + ans1 / n);
	            System.out.println("Average of the Odd Number = " + ans / m);

	    }
	
	}


