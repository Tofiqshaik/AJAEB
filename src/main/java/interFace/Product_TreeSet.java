package interFace;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Product_TreeSet {
	public static void main(String[] args) {
		Set<Product1> s = new TreeSet<Product1>();
		s.add(new Product1(2, "lap", 35550));
		s.add(new Product1(1, "mobile", 1000));
		s.add(new Product1(3, "tab", 6700));
		s.add(new Product1(4, "earphone", 359));
		/*
		 * Collections.sort(s, (u,v)->{ return });
		 */
		
		
	}

}
