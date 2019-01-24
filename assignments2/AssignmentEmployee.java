package assignments2;

public class AssignmentEmployee {

	 /**

     * Write a method to calculate an employee's contribution for insurance coverage and print it.

     * Amount of deduction is computed as follows:

     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;

     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.

     */

    public static void insuranceCoverage(Employee employee) {
    	
  
    	
        //write your code here
        // employee < 35 3% of salary
    	// 35 < employee <= 50  4% of salary
    	// 50 < employee < 60  5% of salary
    	// employee > 60  6% of salary
    	
    	int employeeAge= employee.age;
    	double salary= employee.salary;
    	double rate = 0.0;
    	
    	if(employeeAge < 35) {
    		rate= salary * 0.03;
    }
    	else if(35 < employeeAge && employeeAge <= 50)
    	{
    		rate= salary * 0.04;
    	
    }
    	else if(50 < employeeAge && employeeAge < 60)
    	{
    		rate= salary * 0.05;
    	}
    	else if(60 < employeeAge)
    	{
    		rate= salary *0.06;
    	}
    	
    	System.out.println("Rate " + rate);
    }

}

