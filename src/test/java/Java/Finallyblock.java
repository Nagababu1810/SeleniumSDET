package Java;

public class Finallyblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		try 
		{
		System.out.println(a/0);
		}
		catch (NullPointerException e)
		{
			System.out.println("Entr into the catch block");
		}
		finally
		{
			
			System.out.println("Enter into the finally block");
		}
		
		
	}

}
