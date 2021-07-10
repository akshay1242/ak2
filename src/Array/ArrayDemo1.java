package Array;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int abc[]= {10,28,50,30,70,38};
		System.out.println(abc[1]+abc[2]-abc[3]+(abc[2]/abc[0]));
	
		
		char abc1[]= {'A','k','s','h','n','i','t','a'};
		
		for (char ab:abc1) {
			System.out.print(ab);//Akshnita
		}
		
		System.out.println("A"+abc1[2]);//As
		System.out.println(abc1[0]);// A
		
		
		String abc2[]= {"java","java1","java2"};
		System.out.println(abc2[2]);//java2
		
		
		boolean abc3[]= {true,false,true};
		System.out.println(abc3[0]);// true
		
		
	}

}
