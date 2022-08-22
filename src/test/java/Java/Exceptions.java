package Java;

import net.jodah.failsafe.Execution;

public class Exceptions {
	
	public static void main(String[] args) {
		
		//check and uncheked exceptions
		
		
		System.out.println("program is started");
		
		
		
		int a=10;
		/*try 
		{
		System.out.println(a/0); //arthimatic exceptions
		}
		catch(Exception e)
		{
			System.out.println("Enter into the cathch block");
		}*/
		
		
		String s=null;
		/*try 
		{
		System.out.println(s.length());  //null pointer exception
		}
		catch(Exception e) {
			System.out.println("Enter into the catch block");
		}*/
		
		
		
		String x="abc";
		/*try {
		int i=Integer.parseInt(s);    //Number formate exception
		}
		catch(Exception e) {
			System.out.println("Enter into the catch block");
		}*/
		
		
		int arr[]=new int [5];
		try {
			arr[10]=100;    // Array index boundary exception
		}
		catch(Exception e)
		{
			System.out.println("Entr into the catch block");
		}
		               
		
		
		System.out.println("program is executed");
		System.out.println("program is completed");
		
		
		
	}
	
	
}
