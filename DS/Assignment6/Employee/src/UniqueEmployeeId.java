/**
 * This class extends Employee class and stores uniqie objects of Employee class
 * and remove duplicate employees. Two employees with same employee Id are
 * treated as duplicate Employees. So All the Employee Objects have unique Employee Id.
 */

import java.util.HashSet;
import java.util.Set;

/**
 * @author Amit
 */

public class UniqueEmployeeId extends Employee{

	public static void main(String[] args) {

		/* employeeSet is a set of employee objects */
		Set<Employee> employeeSet = new HashSet<Employee>();
		
		/* adding objects to employeeSet */
		employeeSet.add(new Employee(102, "Sanjay", "Adarsh Nagar"));
		employeeSet.add(new Employee(101, "Anurag", "Pratap Nagar"));
		employeeSet.add(new Employee(101, "Ankur", "Malviya Nagar"));
		employeeSet.add(new Employee(105, "Gaurav", "Sitapura"));
		employeeSet.add(new Employee(103, "Amit", "Jhotwara"));

		/* Displaying quique Employees stored in employeeSet */
		for(Employee e: employeeSet) {
			System.out.println(e.getEmployeeId()+"\t"+e.getEmployeeName()+"\t"+e.getEmployeeAddress());
		}
	}

}
