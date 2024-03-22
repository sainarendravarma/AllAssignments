import java.util.ArrayList;

public class Program3_jdbc {
	int id;
	String name;
	ArrayList<String> department;

	Program3_jdbc(int id, String name, String[] department) {
		this.id = id;
		this.name = name;
		this.department = new ArrayList<String>();
		for (String dept : department) {
			this.department.add(dept);
		}
	}

	public void removeDepartment(String dept) {
		department.remove(dept);
		System.out.println(id + " " + name + " " + department);
	}

	public void changeName(String name) {
		this.name = name;
		System.out.println(id + " " + name + " " + department);
	}

	public void clearAllElements(ArrayList<String> arraylist) {
		arraylist.clear();
		System.out.println(id + " " + name + " " + department);
	}

	public static void main(String args[]) {
		Program3_jdbc obj = new Program3_jdbc(1, "varma", new String[] { "IT", "HR" });
		System.out.println(obj.id + " " + obj.name + " " + obj.department);
		obj.removeDepartment("HR");
		obj.changeName("vamsi");
		obj.clearAllElements(obj.department);
		;
	}
}
