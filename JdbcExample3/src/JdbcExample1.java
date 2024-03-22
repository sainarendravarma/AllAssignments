import java.sql.*;

public class JdbcExample1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aaslin", "root", "root");
			Statement stmt = con.createStatement();
			String str = "insert into employee values(11,'sasi','6000','rohit',2,4)";
			System.out.println("connected to aaslin database");
			int x = stmt.executeUpdate(str);
			if (x > 0)
				System.out.println("record inserted");
			else
				System.out.println("error in  inserting");
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
