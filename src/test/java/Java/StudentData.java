package Java;

public class StudentData {

	
	int Sid;
	String sname;
	int totlmarks;
	int sub1;
	int sub2;
	int sub3;
	
	
	 void getData(int id,String name)
	{
		
		Sid=id;
		sname=name;
	}
	
	void getStudentmarks(int sb1,int sb2,int sb3) {
		
		sub1=sb1;
		sub2=sb2;
		sub3=sb3;
		
	}
	
	void getTotalmarks(int ttmarks) {
		
		System.out.println("total marks:"+ttmarks);;
		
	}
	
	void display() {
		
		System.out.println(Sid+"      "+sname);
		System.out.println(sub1+"   "+sub2+"     "+sub3);
		System.out.println("Total marks:"+totlmarks);
	}
	
	
	public static void main(String[] args) {
		
		StudentData sd=new StudentData();
		sd.getData(101, "Raju");
		sd.getStudentmarks(80, 90, 100);
		//sd.getTotalmarks();
		
		sd.display();
		
		
	}
	
}
