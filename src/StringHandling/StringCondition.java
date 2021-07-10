package StringHandling;

public class StringCondition {

	public static void main(String[] args) {
		 
		String str1 = "java";
		String str2 = "JAVA";
		String str3 = "programs";
		String str4 = "java";
		String str5 = "  java1  ";
		String str6 = "automation java programs";
		
		
		// Concatination
		System.out.println(str1+str3);//Result - javaprograms
		System.out.println(str1.concat(str3));//Result -javaprograms
		System.out.println("java"+10+10);//Result - java1010
		System.out.println("java"+(10+10));//Result - java20
		System.out.println(10+10+"java");//Result - 20java
		
		//using comparison method
		System.out.println(str1==str4);//Result - true
		System.out.println(str1==str2);//Result - false
		
		//using equals methods
		System.out.println(str1.equals(str4));//Result - true
		System.out.println(str1.equals(str2));//Result - false
		
		// using compareTo method
		System.out.println(str1.compareTo(str2));//Result - positive
		System.out.println(str1.compareTo(str4));//Result - 0
		System.out.println(str2.compareTo(str1));//Result - negative
		
		// using charAt
		System.out.println(str1.charAt(2));//Result - v ( in  charAt start no from 0)
		System.out.println(str1.charAt(0));//Result - j
		
		// using equalsIgnoreCase method(in case of same name)
		System.out.println(str1.equalsIgnoreCase(str2));//Result - true 
		System.out.println(str1.equalsIgnoreCase(str3));//Result - false ( because of diff name)
		
		//using toUppercase method
		System.out.println(str1.toUpperCase()); //Result - JAVA
		
		//using toLowercase method
		System.out.println(str2.toLowerCase());//Result - java
		
		//using trim method
		System.out.println(str5.trim());//Result - java1(remove space)
		
		
		//using substring method
		System.out.println(str6.substring(11));//Result - java programs( start from 8 no char)
		System.out.println(str6.substring(0,10));//Result -automation

		
		
		
		//using endwith method
		System.out.println(str6.endsWith("programs"));//Result - true
		System.out.println(str6.endsWith("ams"));//Result - true
		System.out.println(str6.endsWith("java"));// Result - false
		
		//using length method
		System.out.println(str1.length());
	

	}

}
