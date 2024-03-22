
public class Employee {
	private int id;
	private String name;
	
	private Department dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return "Employee [id="+this.id+", name="+this.name+", Department name="+dept.getName()+"]";
	}
}
