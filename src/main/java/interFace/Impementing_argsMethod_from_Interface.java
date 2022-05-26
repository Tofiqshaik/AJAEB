package interFace;

public class Impementing_argsMethod_from_Interface {
	public static void main(String[] args) {

		InterFaceWithargs i = (name) -> {
			System.out.println("hi  " + name);
		};
		i.m1("vaibhav");
		////////////////////////////////////////////////////////////////////////////

		UsingReturntype_and_add_in_fun u = (c, d) -> {
			return c + d;
		};
		System.out.println(u.add(10, 20));
	}

}
