package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteintoTablePreparedStatement {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the id to delete");
		int id = scn.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","root");
		PreparedStatement ps = connection.prepareStatement("delete from student where id = ?");
		ps.setInt(1, id);
		ps.execute();
		System.out.println();
		System.out.println("Deleted");
		
	}

}
