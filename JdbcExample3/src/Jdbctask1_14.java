
import java.sql.*;
import java.util.*;

class Jdbctask1_14 {
	public static ResultSet method(String s1, Connection con) {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(s1);
			return rs;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public static void main(String args[]) {
		try {
			ArrayList<String> list = new ArrayList<String>();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aaslin", "root", "root");
			Scanner s = new Scanner(System.in);
			System.out.println("enter the query");
			Class.forName("com.mysql.cj.jdbc.Driver");
			String s1 = s.nextLine();
			ResultSet rs1 = method(s1, con);
			while (rs1.next()) {
				Employee e = new Employee();
				e.setId(rs1.getInt(1));
				e.setFirstName(rs1.getString(2));
				e.setLastName(rs1.getString(3));
				list.add(String.valueOf((e.getId())));
				list.add(e.getFirstName());
				list.add(e.getLastName());
				System.out.println("the elements are : ");
				for (String itr : list) {
					System.out.println(itr);
				}
				con.close();
				break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
