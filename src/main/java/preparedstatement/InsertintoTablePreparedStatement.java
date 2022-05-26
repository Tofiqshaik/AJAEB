package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertintoTablePreparedStatement {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the name");
		String name = scn.next();
		System.out.println("enter the id");
		int id = scn.nextInt();
		System.out.println("enter the phone no");
		int phone = scn.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","root");
		PreparedStatement ps = connection.prepareStatement("insert into student values (?,?,?)");
		ps.setInt(1, id);
		ps.setInt(3, phone);
		ps.setString(2, name);
		ps.execute();
		System.out.println();
		System.out.println("inserted");
		
	}

}
