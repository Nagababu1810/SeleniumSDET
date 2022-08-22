package colectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		
		String arr[]= {"Nagababu","Jagadeesh","parvathi","Bhavani"};
		
		
		/*for(String Value:arr) 
		{
		System.out.println(Value);	
		}*/
		
		
		System.out.println("===============Converting Array list==================");
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println("Arrange alphabtical order"+al);
		
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Arrange the reverse order"+al);
		
	}

}
