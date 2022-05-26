package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ShowStudent {
	//static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","root");
		PreparedStatement ps = connection.prepareStatement("select *  from student");
		ResultSet r =ps.executeQuery();
		while(r.next())
		{
			System.out.print(r.getInt(1)+" ");
			System.out.print(r.getString(2)+" ");
			System.out.println(r.getInt(3));
			
		}
		System.out.println();
		
	}


}
