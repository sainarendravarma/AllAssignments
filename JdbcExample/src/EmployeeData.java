import java.util.List;
import java.util.ArrayList;

public class EmployeeData {

	    private int id;
	    private String name;
	
	    private List<SalaryData> salaries;

	    public EmployeeData(int id, String name) {
	        this.id = id;
	        this.name = name;
	        this.salaries = new ArrayList<>();
	    }

	    public void addSalaryData(SalaryData SalaryData) {
	        salaries.add(SalaryData);
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +"id=" + id +", name='" + name + '\'' +", salaries=" + salaries + '}';
	    }
	}