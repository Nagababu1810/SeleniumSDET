package Java;

public class Employee {

	
	int id;
	String name;
	int salary;
	String city;
	int age;
	
	
	public void display() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(city);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		
		Employee emp1=new Employee();
		emp1.id=100;
		emp1.name="raju";
		emp1.salary=10000;
		emp1.city="kkd";
		emp1.age=25;
		
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.id=101;
		emp2.name="bhuvan";
		emp2.salary=50000;
		emp2.city="rjy";
		emp2.age=52;
		emp2.display();
		
	}
	
	
	
	
	
}
