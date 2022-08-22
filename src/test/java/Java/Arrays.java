package Java;

public class Arrays {


	public static void main(String[] args) {
		
		/*int a[]=new int[10];
		 
		 int a[]={10,20,30,40,50,60};
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		a[6]=70;
		a[7]=80;
		a[8]=90;
		a[9]=100;*/
	
		
		//System.out.println(a[9]);
		
		/*for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}*/
		
		/*for(int i: a) {
			
			System.out.println(i);
		}*/
		
		
		int a[][]=new int[3][2];
		
		
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		
		
		//System.out.println(a[0][0]);
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;i<a[i].length;j++) {
				
				System.out.println(a[i][j]);
			}
			
		}
		
	}
	
	
	
	
}
