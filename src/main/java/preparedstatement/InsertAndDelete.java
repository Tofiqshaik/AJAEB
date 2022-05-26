package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertAndDelete {
	static Scanner scn = new Scanner(System.in);
	public static Connection getConnect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc","root","root");
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		boolean exit = true;
		while(exit)
		{
			System.out.println("1.add student \n2.delete student \n3.show student\n 4.exit");
			int chioce = scn.nextInt();
			switch(chioce)
			{
			case 1:
			{
				System.out.println("enter the name");
				String name = scn.next();
				System.out.println("enter the id");
				int id = scn.nextInt();
				System.out.println("enter the phone no");
				int phone = scn.nextInt();
				
				Connection connection = getConnect();
				PreparedStatement ps = connection.prepareStatement("insert into student values (?,?,?)");
				ps.setInt(1, id);
				ps.setInt(3, phone);
				ps.setString(2, name);
				ps.execute();
				System.out.println();
				System.out.println("inserted");
			}
			break;
			case 2:
			{
				System.out.println("enter the id");
				int id = scn.nextInt();
				Connection connection = getConnect();
				PreparedStatement ps = connection.prepareStatement("delete from student where id = ?");
				ps.setInt(1, id);
				ps.execute();
				System.out.println();
				System.out.println("Deleted");
			}
			break;
			case 3:
			{
				System.out.println("enter the id");
				int id = scn.nextInt();
				Connection connection = getConnect();
				PreparedStatement ps = connection.prepareStatement("select *  from student where id=?");
				ps.setInt(1, id);
				ps.execute();
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
		}
		
	}

}
