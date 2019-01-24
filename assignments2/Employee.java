package assignments2;

public class Employee {
    String name;
	int age;
	Gender gender;
	double salary;
	
	// Constructor. Please set all the data in constructor.
    public Employee(int age, Gender gender, double salary, String name) {
		
    	this.name= name;
    	this.age=age;
    	this.gender=gender;
    	this.salary=salary;
    	
	}

	// Getter for `name`. Return the current `name` data

    public String getName() {
		
	//write your code here
    	return name;
    	    
    }

    // Setter for `name`. Set `name` data

    public void setName(String name) {
    			//write your code here
    	
    	       this.name= name;

    	

    }

    public void raiseSalary(double byPercent)
    {
    	 this.salary = this.salary + (byPercent/100 *  this.salary);
    	 System.out.println(this.salary);
    }
}
	
	
enum Gender {

    MALE,

    FEMALE;

}


