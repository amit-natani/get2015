
public class ParameterizedConstructorDemo {
	
	public static void main(String args[]) {
		User userObject1 = new User ("Amit","amit.natani@metacube.com");
		userObject1.setCompanyName("Metacube");
		User userObject1 = new User ("Ankit","ankit@gmail.com");
		
		System.out.println(userObject1);
		System.out.println(userObject2);
	}
}

class User {
	private String name;
	private String email;
	private String companyName;

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", companyName="
				+ companyName + "]";
	}

}
