package methods;

public class Metdods5VARANGS {
/*static int sum(int a,int b) {
	return a+b;
}
static int sum(int a,int b,int c) {
	return a+b+c;
}*/
	static int sum(int ...arr) {
		//available as int [] arr;
		int result=0;
		for(int a: arr) {
			result+=a;
		}
		return result;
	}
public static void main(String[] args) {
	System.out.println("use of varangs");
	System.out.println("the sum noting "+sum());
	System.out.println("the sum of 1 is:"+sum(1));
	System.out.println("the sum of 4 and 5 is:"+sum(4,5));
	System.out.println("the sum of 4 ,5 and 3 is:"+sum(4,5,3));
	System.out.println("the sum of 4 ,5,3 and 6 is:"+sum(4,5,3,6));
	//same as agar hame agee krte jana hai there we use Varangs
	//with the help of Varangs we dont need to create such methods
	//with the help of 1 methods now we r getting ur results
}
}
