package Vehicle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VehicleDao {
	public Statement getStatment() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","root");
		Statement stu = con.createStatement();
		return stu;
	}
	public void insertNew() throws Exception {
		Statement stu = getStatment();
		stu.execute("insert into Vehicle values(123,'Pulser','Mode21',60,'vaibhav',977,'Gadag')");
		stu.execute("insert into Vehicle values(134,'KTM','Mode78',50,'naresh',805,'AP')");
		stu.execute("insert into Vehicle values(156,'R-E','Mode98',10,'raja',894,'Hubali')");
		stu.execute("insert into Vehicle values(165,'Himayan','ModHIM',30,'rajesh',912,'Haveri')");
		stu.execute("insert into Vehicle values(186,'R-15','R15Mod',60,'headachce',898,'BNG')");
		stu.execute("insert into Vehicle values(185,'Hero','Her5655',100,'mava',834,'UP')");
		
		stu.close();
	}
	public void updateVehicle() throws Exception {
		Statement stu = getStatment();
		stu.executeUpdate("update Vehicle set Model='mofe23' where Vehicle No=123");
		stu.close();
	}
	public void deletevehicle() throws Exception {
		Statement stu = getStatment();
		stu.execute("delete from Vehicle where Company='Pulser'");
		stu.execute("delete from Vehicle where Company='KTM'");
		stu.execute("delete from Vehicle where Company='Hero'");
		stu.execute("delete from Vehicle where Company='R-E'");
		stu.execute("delete from Vehicle where Company='Himayan'");
		stu.execute("delete from Vehicle where Company='R-15'");
		stu.close();
	}
	public ResultSet getAllVehicles() throws Exception {
		Statement stu = getStatment();
		ResultSet r=stu.executeQuery("Select * from Vehicle");
		return r;
	}
}
