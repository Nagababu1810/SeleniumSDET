package colectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		
		System.out.println(al);
		
		ArrayList al_d=new ArrayList();
		al_d.addAll(al);
		
		System.out.println(al_d);
		
		Collections.sort(al_d);
		System.out.println("element in array list"+al_d);
		
		Collections.sort(al_d,Collections.reverseOrder());
		System.out.println("element in array list reverse"+al_d);
		
		
	}

}
