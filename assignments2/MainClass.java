package assignments2;

public class MainClass {

	public static void main(String[] args)	
	{
		Employee xyz= new Employee(25,Gender.FEMALE,2000.00, "rekha" );
	    
		xyz.setName("rekha saribala");
		System.out.println(xyz.getName());
		
		Assignment2 sampleSalary = new Assignment2();
		sampleSalary.socialSecurityTax(xyz);
		
		Employee emp= new Employee(24, Gender.MALE, 10000, "Ashish");
		
		Assignment2 sampleSalary1 = new Assignment2();
		sampleSalary.socialSecurityTax(emp);
		
		
		
		Employee employee = new Employee(21, Gender.MALE, 500, "John");
		Employee employee1= new Employee(22, Gender.FEMALE, 1200, "Jenny");
		Employee employee2= new Employee(23, Gender.FEMALE, 1000, "Alice");
		
		AssignmentD sort1 = new AssignmentD();
		sort1.sortSalary(employee, employee1, employee2);
		
		Employee tsal = new Employee(25,Gender.FEMALE,2000.00, "rekha");
		
		AssignmentE raise= new AssignmentE();
		raise.tripleSalary(tsal);
		System.out.println(tsal.salary);
		
	}
	
	
	
}
