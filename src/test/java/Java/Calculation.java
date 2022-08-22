package Java;

public class Calculation {

	
	int x;
	int y;
	int z;
	
	
	public Calculation() {
		
		x=10;
		y=20;
		z=30;
		
	}
		
	public void  sum() 
	{
		
		System.out.println("The sum of value:"+(x+y)+z);
		System.out.println("The sum of value"+(x-y)+z);
		
		
	}
		
	public static void main(String[] args) {
		
		Calculation cl=new Calculation();
		cl.sum();
		
		
		
	}
	
	
	}
	
	
	

