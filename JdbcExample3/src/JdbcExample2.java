import java.sql.*;  
import java.util.*;
class JdbcExample2{  
	public static ResultSet method(String s1,Connection con) {
		try {
		Statement stmt=con.createStatement(); 
		ResultSet rs=stmt.executeQuery(s1);
		return rs;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
			}
public static void main(String args[]){  
try{  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aaslin","root","root");
	Scanner s = new Scanner(System.in);
	System.out.println("enter the query");
	Class.forName("com.mysql.cj.jdbc.Driver");  
	String s1=s.nextLine();
	ResultSet rs1=method(s1,con);
while(rs1.next())  
System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+"  "+rs1.getString(3)+"  "+rs1.getString(4)+"  "+rs1.getInt(5)+"  "+rs1.getInt(6));   
con.close();
}catch(Exception e){ System.out.println(e);}  
}  
}
