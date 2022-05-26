package factory.implention;

public class FactoryShape {

	public static Shape getRef(String s) {
		if (s.equalsIgnoreCase("circle")) {
			return new circle();
		} else if (s.equalsIgnoreCase("Square")) {
			return new Square();
		} else if (s.equalsIgnoreCase("Triangle")) {
			return new Triangle();
		}
		return null;
	}

}
