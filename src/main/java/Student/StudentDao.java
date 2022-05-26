package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	
	public Statement getStatment() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","root");
		Statement stu = con.createStatement();
		return stu;
	}
	
	public void insertStudent() throws Exception {
		Statement stu = getStatment();
		stu.execute("insert into Student values(4,'vaibhav',344)");
		stu.execute("insert into Student values(1,'naresh',434)");
		stu.execute("insert into Student values(2,'shiva',334)");
		stu.execute("insert into Student values(3,'rajesh',364)");
		System.out.println("insert done..................!");
		System.out.println("====================================");
		stu.close();
	}
	
	public void Update() throws Exception {
		
		Statement stu= getStatment();
		stu.executeUpdate("update student set name = 'teja' where id=2");
		System.out.println("update done..................!");
		System.out.println("=====================================");
		stu.close();
	}
	
	public void delete() throws Exception {
		
		Statement stu = getStatment();
		stu.execute("Delete from Student where id=3");
		System.out.println("delete done...................!");
		System.out.println("=============================");
		stu.close();
	}
	
	public ResultSet selectallStudent() throws Exception {
		Statement stu = getStatment();
		ResultSet rs = stu.executeQuery("select * from Student");
		return rs;
	}
	

}
