package htmlConnectingJava;

public class EmployeeModelClass {
	private int id;
	private String name;
	private String email;
	private double salary;
	
	 public EmployeeModelClass() {
		// TODO Auto-generated constructor stub
	}
	 
	public EmployeeModelClass(int id, String name, String email, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeModelClass [id=" + id + ", name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
	

}
