package methods;

public class Methods2bycreatingobj {
	int logic(int a,int b) {
		
		return a+b;
	}
public static void main(String[] args) {
	Methods2bycreatingobj m=new Methods2bycreatingobj();
	int i=m.logic(7, 6);
	int i2=m.logic(1, 2);
	System.out.println(i);
	System.out.println(i2);
}

}
