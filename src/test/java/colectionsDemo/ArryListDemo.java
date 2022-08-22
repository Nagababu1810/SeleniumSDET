package colectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ArryListDemo {

	public static void main(String[] args) {
	
		
		ArrayList ar= new ArrayList();
		
		ar.add("10");
		ar.add("20");
		ar.add("30");
		ar.add("Naga");
		ar.add("babu");
		ar.add("100.5");
		System.out.println("befor adding the valu"+ar);
		
		ar.add("30");
		
		System.out.println("After adding the values:"+ar);
		ar.add(2, "15");
		ar.add(6, "40");
		
		System.out.println(ar);
		
		ArrayList ar1=new ArrayList(ar);
		
		ar.addAll(ar1);
		
		ar1.remove("40");
		
		
		System.out.println("remove the data:"+ar1); 
		
		System.out.println(ar.get(7));
		
		
		
		System.out.println(ar1);
		
		
		System.out.println(ar1.size());
		
		ar1.set(0, "python");
		
		System.out.println(ar1);
		
		System.out.println("after adding the valu:"+ar1);
		
		System.out.println(ar1.contains(ar));
		
		//1 retrive the data from collecctions for loop
		
		
		/*for(int i=0;i<ar1.size();i++) 
		{
		System.out.println(ar1.get(i));	
		}*/
		
		//2 retrivve the data from collections using for each
		
		/*for(Object r:ar1)
		{
			System.out.println(r);
		}*/

		//3 using iterator
		System.out.println("reading the element using iterator method");
		Iterator it=ar1.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		
	}

}
