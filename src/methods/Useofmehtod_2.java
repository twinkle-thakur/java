package methods;

import java.util.Scanner;

public class Useofmehtod_2 {
int a,b,add,sub,div,rem,mul;
void input() {
	System.out.println("enter a & b");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	sc.close();
}
void process() {
	add=a+b;
	sub=a-b;
	div=a/b;
	mul=a*b;
	rem=a%b;
}
void output() {
	System.out.println("add: "+add);
	System.out.println("sub: "+sub);
	System.out.println("div: "+div);
	System.out.println("mul: "+mul);
	System.out.println("rem: "+rem);
}
public static void main(String[] args) {
	Useofmehtod_2 u=new Useofmehtod_2();
	u.input();
	u.process();
	u.output();
}
}
