package akshayjava;

public class logicaloperator {
	
	public static void main (String[]args)
	{
		int a=100, b=70, c=30;
		//Logical And
		System.out.println((a>b)&&(a>c));//true,true
		System.out.println((a>b)&&(b>a));//true,false
		System.out.println((b>a)&&(b>c));//false,true
		System.out.println((c>b)&&(c>b));//false,false
		// Logical OR
		System.out.println((a>b)||(a>c));//true,true
		System.out.println((a>b)||(b>a));//true,false
		System.out.println((b>a)||(b>c));//false,true
		System.out.println((c>b)||(c>b));//false,false
		// logical Not
		System.out.println(!(a>b));//true
		System.out.println(!(b>a));//false
	}

}
