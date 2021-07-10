package Inheritance;

public class B extends A {
	public void test2demo() {
		System.out.println("test2demo");
	}
	public static void akshay(){
		System.out.println("test");
	}
public static void main (String[]args) {
	B t2 =new B();
	t2.test2demo();
	t2.test1demo();
	
	B.akshay();
}
}
