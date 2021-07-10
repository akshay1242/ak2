package Interface;

public class test implements InterfaceI1,Interface2 {

	@Override
	public void school() {
		System.out.println("childrens");
		
	}

	@Override
	public void planet() {
		System.out.println("multiple");
		
	}
public static void main(String[]args) {
	test t1 = new test();
	t1.school();
	t1.planet();
}
}
