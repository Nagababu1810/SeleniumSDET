package colectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet hs= new HashSet();
		hs.add("10");
		hs.add("20");
		hs.add("30");
		hs.add("40");
		hs.add("50");
		hs.add("60");
		
		
		System.out.println(hs);
		
		hs.add("100");
		
		System.out.println("After adding the value:"+hs);
		
		HashSet hs_n=new HashSet();
		hs_n.add(hs);
		
		System.out.println(hs_n);
		
		//1 exterat the data from collections
		/*for(int i=0;i<hs.size();i++)
		{
			System.out.println(hs);
			
			
		}*/
		
		
		// 2.exterate the data from collection using for each
		
		for(Object h:hs) {
			System.out.println(h);
		}

	}

}
