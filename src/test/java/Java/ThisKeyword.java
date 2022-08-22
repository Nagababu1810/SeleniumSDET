package Java;

public class ThisKeyword {

	int a; //instance variables or class variables
	int b;
	
	void getvalues(int a,int b) //method variables or external variables
	{
		
		this.a=a;
		this.b=b;
		
	}
	
	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		
		ThisKeyword tk=new ThisKeyword();
		tk.getvalues(10, 20);
		tk.printvalues();
		
		
	}
}
