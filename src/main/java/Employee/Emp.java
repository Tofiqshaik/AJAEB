package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Emp {
	public static void main(String[] args) throws Exception {
		PreparedStatement ps = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc", "root", "root");
	    ps = con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1, 345);
		ps.setString(2, "raja");
		ps.setString(3, "mao@namd.com");
		ps.setString(4, "223");
		ps.addBatch();
		ps.setInt(1, 457);
		ps.setString(2, "raja");
		ps.setString(3, "mao@namd.com");
		ps.setString(4, "223");
		ps.addBatch();
		ps.setInt(1, 878);
		ps.setString(2, "raja");
		ps.setString(3, "mao@namd.com");
		ps.setString(4, "223");
		ps.addBatch();
		System.out.println("============");
		ps.executeBatch();
		System.out.println("inserted");
	}

}
