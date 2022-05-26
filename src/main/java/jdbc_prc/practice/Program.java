package jdbc_prc.practice;

import java.sql.Connection; //1 step
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner scn = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");//2 step losecopling
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","root"); //3 step
		Statement statement = connection.createStatement();//4 step
		 
	 	statement.execute("insert into student values (5,'suneetha',463)");//5 step
		statement.execute("insert into student values (2,'vaibhav',232)");//5 step
		statement.execute("insert into student values (3,'jagadeesh',443)");//5 step
		statement.execute("insert into student values (4,'fish',343)");//5 step
		System.out.println("inserted");
		statement.close();//7 step
		connection.close();//7 step
		
	}    

}
