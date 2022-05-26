package factory.implention;

import java.util.Scanner;

public class VehicleDriver {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("enter the bike name");
		String name = scn.next();
		try {
			Vehicle  v = CheckVehicle.check(name);
			v.typeof();
		} catch (Exception e) {
			System.out.println("somthing wrong");
		}
	}

	
}
