package methods;

public class Method4overloading {
static void print() {
	System.out.println("hello bro...");
}
static void print(int a) { //a is a parameter
	System.out.println("hello "+ a+" bro...");
}
public static void main(String[] args) {
	print();
	print(3);//3 is argument and arguments are actual
}
}
//imp: method overloading can't be performed by changing return type of method