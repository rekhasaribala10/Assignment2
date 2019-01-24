package assignments2;

public class AssignmentD {

	/**
	 * 
	 * Write a method to sort three employees' salary from low to high, and then
	 * print their name in order.
	 * 
	 * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is
	 * 1200, you should print:
	 * 
	 * John Alice Jenny
	 * 
	 */

	public void sortSalary(Employee e1, Employee e2, Employee e3) {
		if (e1.salary < e2.salary && e2.salary < e3.salary) {
			System.out.println(e1.name + " " + e2.name + " " + e3.name);
		}
		else if (e1.salary < e2.salary && e1.salary > e3.salary) {
			System.out.println(e3.name + " " + e1.name + " " + e2.name);
		}
		else if (e2.salary < e1.salary && e1.salary < e3.salary) {
			System.out.println(e2.name + " " + e1.name + " " + e3.name);
		} else if (e1.salary < e3.salary && e2.salary > e3.salary) {
			System.out.println(e1.name + " " + e3.name + " " + e2.name);
		} else if (e3.salary < e2.salary && e2.salary < e1.salary) {
			System.out.println(e3.name + " " + e2.name + " " + e1.name);
		} else if (e2.salary < e3.salary && e3.salary < e1.salary) {
			System.out.println(e2.name + " " + e3.name + " " + e1.name);
		}
	}
}
