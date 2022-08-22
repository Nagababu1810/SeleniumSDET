package javaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		
		
		
		/*StringBuffer sb=new StringBuffer();
		sb.append(name);
		System.out.println(sb.reverse());*/
		
		
		/*StringBuilder sob=new StringBuilder();
		sob.append(name);
		System.out.println(sob.reverse());*/
		
		String str=name;
		String rev="";
		
		int lenght= str.length(); //4
		
		for(int i=lenght-1;i>=0;i--) 
		{
			
			rev=rev+str.charAt(i);
			//rev=rev+str.charAt(i);
		}
		
		System.out.println("Enter the String Value:"+ rev);
		
		
		
		
		
		
	}
	
	
}
