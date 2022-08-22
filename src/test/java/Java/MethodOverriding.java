package Java;

public class MethodOverriding {

	
	void parent()
	{
		System.out.println("parent class");
		
	}
	
	void parent1() {
		System.out.println("parent class1");
	}
	
	public class b{
		
		
		void parent2() {
			
			System.out.println("parent class2");
		}
		
		
	}
	
	
		public static void main(String[] args) {
		
		
		MethodOverriding mov=new MethodOverriding();
		mov.parent();
		
		
		
		
	}
}
