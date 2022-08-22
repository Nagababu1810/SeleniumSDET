package javaPrograms;

import java.util.Scanner;

public class PaildromString {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String str=sc.next();

		String org_String=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		
		
		if(org_String.equals(rev)) {
			
			System.out.println("Palidrom name:"+org_String);
		}
		else {
			
		
		System.out.println("not paildrom name:"+org_String);
		
		}
	}

}
