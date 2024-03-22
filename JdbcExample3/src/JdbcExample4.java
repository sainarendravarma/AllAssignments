import java.sql.*;  
import java.util.*;
class JdbcExample4{  
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
	public static ResultSet insertMethod(String s1,Connection con) {
		try {
		String str1="insert";
		boolean check = s1.contains(str1);
		if(check==true) {
		Statement stmt=con.createStatement(); 
		int rs1=stmt.executeUpdate(s1);
		if(rs1==1)  
			System.out.println("inserted");
			con.close();
		}
		else {
			System.out.println("you can only insert");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
			}
	public static ResultSet updateMethod(String s1,Connection con) {
		try {
			String str1="update";
			boolean check = s1.contains(str1);
			if(check==true) {
		Statement stmt=con.createStatement(); 
		int rs1=stmt.executeUpdate(s1);
		if(rs1>0)  
			System.out.println("updated");
			con.close();
		}
		else {
			System.out.println("you can only update");

		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
			}
	public static ResultSet deleteMethod(String s1,Connection con) {
		try {
			String str1="delete";
			boolean check = s1.contains(str1);
			if(check==true) {
		Statement stmt=con.createStatement(); 
		int rs1=stmt.executeUpdate(s1);
		if(rs1>0)  
			System.out.println("deleted");
			con.close();
		}
			else {
				System.out.println("you can only delete");

			}
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
	System.out.println("insert - 1\nupdate - 2 \ndelete - 3 \nretrive - 4");
	Class.forName("com.mysql.cj.jdbc.Driver"); 
	int choice = s.nextInt();
	if(choice==1) {
		System.out.println("enter the query");
		//insert into employee(id,name,email,phone,salary,depid) values(12,'karishma','narendra.aaslin@gmail.com','9014928273',20000,5)
		s.nextLine();
		String s1=s.nextLine();
		insertMethod(s1,con);
	}
	if(choice==2) {
		System.out.println("enter the query");
		s.nextLine();
		String s1=s.nextLine();
		updateMethod(s1,con);
	}
	if(choice==3) {
		System.out.println("enter the query");
		s.nextLine();
		String s1=s.nextLine();
		deleteMethod(s1,con);
	}
	if(choice==4) {
		System.out.println("enter the query");
		s.nextLine();
		String s1=s.nextLine();
		retriveMethod(s1,con);
	}
}
catch(Exception e){ System.out.println(e);}  
}  
}
