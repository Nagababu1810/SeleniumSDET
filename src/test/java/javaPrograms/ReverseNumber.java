package javaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		//String str="67890";
		int rev=0;
		
		//StringBuffer sb=new StringBuffer();
		//sb.append(str);
		//System.out.println(sb.reverse());
		
		//StringBuilder sob=new StringBuilder();
		//sob.append(num);
		//System.out.println(sob.reverse());
		
		
		while(num!=0)
		{
			rev=rev*10+ num%10; //0+4  //40+3=43  //430+2=432 4320+1=4321
			num=num/10; //123  //123/10=12  12/10=1 1/10=0
			
		}
		
		System.out.println("reverse String:"+rev);
		
	}
	
	
}
