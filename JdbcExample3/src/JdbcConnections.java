import java.sql.*;
public class JdbcConnections {
	public Connection connect() {
     try
     {
        Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/jdbc","root","root");
System.out.println("connected to aaslin database");
return con;
    }
    catch(Exception e)
    {
    System.out.println(e.getMessage());
    }
     return null;
}
	public static ResultSet retriveMethod(String s1,Connection con) {
		try {
			String str1="select";
			boolean check = s1.contains(str1);
			if(check==true) {
		Statement stmt=con.createStatement(); 
		ResultSet rs1=stmt.executeQuery(s1);
		while(rs1.next()) {  
			System.out.println(rs1.getInt(1)+"  "+rs1.getString(2));   
			con.close();
		}
		}else {
			System.out.println("you can only retrive the data");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
			}
	}
    
