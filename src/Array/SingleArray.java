package Array;

public class SingleArray {

	public static void main(String[] args) {
		
		int Array1[]= {24,45,64,34,43};
		
		// for Single array printing
		
		for(int i=0;i<=4;i++) {
			System.out.println(Array1[i]);
		}

		
		System.out.println("Same as we result");
	
		for(int Abc:Array1) {
			System.out.println(Abc);
		}

	}

}
