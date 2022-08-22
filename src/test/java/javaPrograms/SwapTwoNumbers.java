package javaPrograms;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		
		//third party variable
		
		int a=10; int b=20;
		
		System.out.println("swap two numbers:"+a+ "and"  +b);
		
		//int t=a;    //t=10; //a=20; //b=10;
		//a=b;
		//b=t;
		
		//System.out.println("After swap two number:"+a+ "and"+b);
		
		
		//no variables  should not zero 
		
		a=a+b;  //10+20=30   // 30-20=10  //30-10=20
		b=a-b;
		a=a-b;
		
		System.out.println("After swap two number:"+a+ "and"+b);
	}
	
	
}
