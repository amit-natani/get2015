/**
 * 
 */

/**
 * @author Amit
 *
 */
public class MainPerson {

	public static void main(String[] args) 
	{
		try
		{
			Employee employee1 = new Employee(12345432, "Ankit", 101, "Finance");
			Employee employee2 = new Employee(98765674, "Amit", 102, "Accounts");
			System.out.println(employee1.toString());
			System.out.println(employee2.toString());
			
			Student student1 = new Student(23454567, "Avinash", 201);
			Student student2 = new Student(54356456, "Vishal", 202);
			System.out.println(student1.toString());
			System.out.println(student2.toString());
			student1.setName("Amit");
			System.out.println(student1.toString());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return;
		}
	}

}
