package jdbc_prc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","root");
		Statement sta = con.createStatement();
		sta.executeUpdate("Delete from student where id=6");
		sta.executeUpdate("Delete from student where id=1");
		sta.executeUpdate("Delete from student where id=3");
		sta.executeUpdate("Delete from student where id=5");
		System.out.println("done");
		sta.close();
		con.close();
		
	}

}
