package Student;

import java.sql.ResultSet;

public class StudentDriver {
	public static void main(String[] args) throws Exception {
		StudentDao d= new StudentDao();
		ResultSet r =d.selectallStudent();
		while (r.next()) {
			System.out.println(r.getInt(1));
			System.out.println(r.getString(2));
			System.out.println(r.getInt(3));
		}

	}

}
