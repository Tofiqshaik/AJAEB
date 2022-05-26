package factory.implention;

public class CheckVehicle {

	public static Vehicle check(String s) {
		if (s.equalsIgnoreCase("Bike")) {
			return new Bike();
		} else if (s.equalsIgnoreCase("car")) {
			return new Car();
		} else if (s.equalsIgnoreCase("truck")) {
			return new Truck();
		} else if (s.equalsIgnoreCase("trian")) {
			return new Train();
		} else
			return null;
	}

}
