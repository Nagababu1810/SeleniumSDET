package colectionsDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	
		LinkedList l=new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		System.out.println(l);
		l.add("E");
		System.out.println(l);
		
		//1 using for loop
		/*for(int i=0;i<l.size();i++) {
			
			System.out.println(l.get(i));
		}*/
		
		
		//2 using for each
		
		/*for(Object value:l)
		{
			System.out.println(value);
		}*/
		
		
		
		//3 using iterator
		Iterator its=l.iterator();
		while(its.hasNext()) {
			
			System.out.println(its.next());
		}
		
		Collections.sort(l);
		System.out.println("After sorting the data"+l);
	}

}
