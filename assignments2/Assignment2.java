package assignments2;



public class Assignment2 {
//Assignment

/**

 * Write a method to calculate the Social Security Tax of an employee and print it.

 * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.

 * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.

 */

public void socialSecurityTax(Employee employee) {

    //write your code here
	// salary <=8900 ssn= 6.2%
	// salary >8900 ssn= 6.2% of 106800
	
	double salary= employee.salary;
	double tax = 0.0;
	
	
	if(salary <= 8900)
	{
		tax= salary * 0.062;
	}else if(salary > 8900)
	{
		tax= 106800 * 0.062;
	}

	System.out.println("Tax= " + tax);
}	

}
