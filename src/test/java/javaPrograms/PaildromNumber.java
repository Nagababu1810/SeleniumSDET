package javaPrograms;

import java.util.Scanner;

public class PaildromNumber {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int org_Num=num;
		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10+ num%10;
			num=num/10;
		}
		
		if(org_Num==rev) {
			
			System.out.println("given Number is paildrom:"   +org_Num);
		}
		else
		{
			System.out.println("given Number not palidrom:"   +org_Num);
			
		}

	}

}
