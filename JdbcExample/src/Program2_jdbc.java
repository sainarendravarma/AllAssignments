import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class Program2_jdbc {
    public static void main(String[] args) {
        List<Employee1> employees = getEmployees(); 
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "root";
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            StringBuilder query = new StringBuilder("INSERT INTO employee1 (age, name, position) VALUES ");
            for (int i = 0; i < employees.size(); i++) {
                Employee1 employee = employees.get(i);
                query.append("(").append(employee.getAge()).append(", ")
                .append("\"").append(employee.getName()).append("\"").append(", ")
                        .append("\"").append(employee.getPosition()).append("\"")
                        .append(")");
                if (i != employees.size() - 1) {
                    query.append(", ");
                }
            } 
            System.out.println(query.toString());
            PreparedStatement statement = conn.prepareStatement(query.toString());
            statement.execute();
            System.out.println("Employees inserted successfully.");

        } catch (SQLException e) {
            System.err.println("Error inserting employees: " + e.getMessage());
        }
    }
    private static List<Employee1> getEmployees() {
        // Method to create and return a list of Employee objects
    	List<Employee1> obj = new ArrayList<Employee1>();
//    	Employee1 e = new Employee1();
//    	e.setAge(11);
//    	e.setName("varma");
//    	e.setPosition("2nd");
//    	obj.add(e);
    	obj.add(new Employee1(55, "Varma", "2nd"));
    	obj.add(new Employee1(66, "Varma", "4nd"));
    	obj.add(new Employee1(77, "Varma", "6nd"));
    	obj.add(new Employee1(88, "Varma", "7nd"));
        return obj;
    }
}
