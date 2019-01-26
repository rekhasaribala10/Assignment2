package assignments2;

public class ExtraCredit {
	
	//Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     Your Answer: x and y just refer to the object memory that a and b are pointing towards, changing values in x and y will change the names but swapping just the reference wont change the values in a and b.
     */
	
	
    public static void main(String[] args) {
        Employee a = new Employee( 20,Gender.FEMALE, 2000,"Jenny");
        Employee b = new Employee( 30, Gender.MALE, 2500,"John");
        
        
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);//
		
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        
        System.out.println("x=" + x.getName());
        
		/*
		 * System.out.println("after = " + x.getName()); System.out.println("after = " +
		 * y.getName());
		 */
      
        
    }
}


