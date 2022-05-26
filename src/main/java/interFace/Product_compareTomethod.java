package interFace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Product_compareTomethod {
	public static void main(String[] args) {
		List<Product1> p = new ArrayList<Product1>();
		p.add(new Product1(1, "laptop", 100000));
		p.add(new Product1(2, "mobile", 10500));
		p.add(new Product1(3, "pen", 10));
		p.add(new Product1(4, "book", 100));
		Collections.sort(p, (q,s)->{
			return q.name.compareTo(s.name);
		});
		for(Product1 o : p) {
			System.out.println(o);
		}
		
		
		
	}

}
