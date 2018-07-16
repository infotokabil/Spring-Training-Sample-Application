package JDBCConnectivity;

public class EmployeeBean {

	int id; 
	String name;
	String salary;
	public EmployeeBean(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
		id=i;
		name=string;
		salary=string2;
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
