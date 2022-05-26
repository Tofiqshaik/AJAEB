package Vehicle;

import java.sql.ResultSet;
import java.util.Scanner;

public class VehicleDriver {
	public static void main(String[] args) throws Exception {
		VehicleDao v = new VehicleDao();
		//v.insertNew();
		//System.out.println("inserted");
		//v.deletevehicle();
		//System.out.println("deleted");
		//v.updateVehicle();
		//System.out.println("excted");
		ResultSet r = v.getAllVehicles();
		while(r.next())
		{
			System.out.println(r.getString(2));
			System.out.println(r.getString("Company"));
			System.out.println();
		}
	}
}
