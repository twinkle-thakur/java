package methods;

public class StaticandnonStatic_1 {
int a=3;
static int b=6;
	void disp() {
//non Static () can access stsic as well as non static varible and obj
//obj is need to be created for () calling		
		System.out.println("a :"+a+" b :"+b);
	}
//Static () can access only Static variable and no need to create obj	
	static void show() {
		System.out.println(" b :"+b);
	}
	public static void main(String[] args) {
		 StaticandnonStatic_1 s=new  StaticandnonStatic_1();
		 s.disp();
		 show();
	}

}
