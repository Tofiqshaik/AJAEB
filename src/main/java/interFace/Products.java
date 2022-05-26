package interFace;

import java.util.ArrayList;

public class Products {
	public static void main(String[] args) {

		ArrayList<String> products = new ArrayList<String>();
		products.add("laptop");
		products.add("mobile");
		products.add("table");
		products.add("sweets");
		products.forEach((p) -> {
			System.out.println(p);
		});

	}

}
