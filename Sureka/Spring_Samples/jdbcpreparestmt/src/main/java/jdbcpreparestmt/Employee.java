package jdbcpreparestmt;

public class Employee {

	private int id;
	private String name;
	private String salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int i, String string, String j) {
		id=i;
		name=string;
		salary=j;
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

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
