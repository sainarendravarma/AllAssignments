
public class Employee_crud {
	int id;
	String name;
	String[] dept = { "HR", "IT" };

	Employee_crud(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String args[]) {
		Employee_crud obj = new Employee_crud(1, "varma");
		System.out.println();
	}

}
