package Java;

public class MethodOverloading {

	public void methodOverloading1(int a,int b) {

		System.out.println(a+b);
	}

	public void methodOverloading1(double a,int b) {

		System.out.println(a+b);
	}

	public void methodOverloading1(int a,double b) {

		System.out.println(a+b);
	}

	public void methodOverloading1(int a,int b,int c) {

		System.out.println(a+b+c);
	}

	public void methodOverloading1(int a,int b,double c) {

		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		
		MethodOverloading mo=new MethodOverloading();
		mo.methodOverloading1(10, 20);
		mo.methodOverloading1(20, 10.5);
		mo.methodOverloading1(15.5, 5);
		mo.methodOverloading1(10, 20, 30);
		mo.methodOverloading1(10, 20,0.5);
		
		
	}

	
	
	
}
