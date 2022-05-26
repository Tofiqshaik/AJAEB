package jdbc_prc.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class excuting
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","root");
		Statement statment=connection.createStatement();
		ResultSet r =statment.executeQuery("select * from student");
		while(r.next())
		{
			System.out.print(r.getInt(1)+"    ");
			System.out.print(r.getString(2)+"    ");
			System.out.println(r.getInt(3)+"       ");
			System.out.println("===========================");
		}
		statment.close();
		connection.close();
		
		
	}

}
