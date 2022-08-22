package Java;

public class ConstructorOverLoading {


	public ConstructorOverLoading(int a,int b) {

		System.out.println(a+b);
	}
	public ConstructorOverLoading(int a,double b) {

		System.out.println(a+b);
	}
	public ConstructorOverLoading(double a,int b) {

		System.out.println(a+b);
	}
	public ConstructorOverLoading(int a,int b,int c) {

		System.out.println(a+b+c);
	}
	public ConstructorOverLoading(int a,int b,double c) {

		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverLoading col=new ConstructorOverLoading(10,20.5);
	}

}
