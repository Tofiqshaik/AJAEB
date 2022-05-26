package Vehicle;

import java.sql.ResultSet;
import java.util.Scanner;

public class VehicleDriver2 {
	public static void main(String[] args) throws Exception {
		VehicleDao v = new VehicleDao();
		Scanner scn =new Scanner(System.in);
		boolean exit = true;
		while(exit)
		{
			System.out.println("1.add vehicle \n2.delete vehicle \n3.show details \n4.update vehcile \n5.exit");
			System.out.println("=========enter anyone================");
			int choice=scn.nextInt();
			switch(choice)
			{
			case 1:
			{
				try {
					v.insertNew();
					System.out.println("==========Inserted================");
				} catch (Exception e) {
					System.out.println("already inserted delete that first");
				}
			}
			break;
			case 2:
			{
				try {
					v.deletevehicle();
					System.out.println("==========Deleted================");
				} catch (Exception e) {
					System.out.println("already inserted delete that first");
				}
				
			}
			break;
			case 3:
			{
				ResultSet r = v.getAllVehicles();
				while(r.next())
				{
					System.out.print(r.getInt(1)+"  ");
					System.out.print(r.getString(2)+"  ");
					System.out.print(r.getString(3)+"  ");
					System.out.print(r.getInt(4)+"  ");
					System.out.print(r.getString(5)+"  ");
					System.out.print(r.getInt(6)+"  ");
					System.out.println(r.getString(7));
					System.out.println("==================================================");
				}
			}
			break;
			case 4:
			{
				try {
					v.updateVehicle();
					System.out.println("==========Updated================");
				} catch (Exception e) {
					System.out.println("already inserted delete that first");
				}
			}
			break;
			case 5:
			{
				exit=false;
			}
			}
		}


	}
	}
