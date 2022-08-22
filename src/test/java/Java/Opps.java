package Java;

public class Opps {

	
	int a=10;
	int b=20;
	
	/*void sum() {
		
		System.out.println(a+b); 
		
	}*/
	
	/*void sum(int a, int b) {
		
		
		System.out.println(a+b);
	}*/
	
	
		int sum() {
			
			return(a+b);
		}
	
	
	public static void main(String[] args) {
		
		Opps op=new Opps();
		//op.sum();
		//op.sum(10, 20);
		int value=op.sum();
		System.out.println(value);
		
		
	}
	
	
	
}
