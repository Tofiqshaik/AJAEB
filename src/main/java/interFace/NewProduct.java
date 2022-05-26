package interFace;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewProduct {
	public static void main(String[] args) {
		List<Product1> al = new ArrayList<Product1>();
		al.add(new Product1(2, "lap", 350));
		al.add(new Product1(1, "mobile", 1000));
		al.add(new Product1(3, "tab", 6700));
		al.add(new Product1(4, "earphone", 359));
		al.add(new Product1(5, "bike", 100000));
		al.add(new Product1(6, "key", 100));
		al.add(new Product1(7, "pen", 10));
		al.add(new Product1(8, "book", 100));
		 
		/*List<Product1> a = new ArrayList<Product1>();
		for (Product1 p : al) {
			if(p.price<=1000) {
				a.add(p);
			}
		}
		for (Product1 p : a) {
			System.out.println(p);
			}*/
		
		// to convert to smaller
		
		
		List<Product1> a2 = al.stream().filter(p -> p.price<1000).collect(Collectors.toList());
		for (Product1 p : a2) {
			System.out.println(p);
		}
		System.out.println("=======================================");
		List<Product1> a3 = al.stream().filter(p -> p.id>5).collect(Collectors.toList());
		for (Product1 p : a3) {
			System.out.println(p);
		}
		System.out.println("========================================");
		List<Product1> a4 = al.stream().filter(p -> (p.price<2000)&&(p.price>100)).collect(Collectors.toList());
		for (Product1 p : a4) {
			System.out.println(p);
		}
		
		// max price using compartor
		System.out.println("==================================");
		Product1 p = al.stream().max((p1,p2)-> p1.price > p2.price ? 1 : -1).get();
		System.out.println(p);
		// min price using compartor
		System.out.println("=================================");
		Product1 u = al.stream().min((p1,p2)-> p1.price > p2.price ? 1 : -1).get();
		System.out.println(u);
		//to count the max price
		System.out.println("================================");
		Long l = al.stream().filter(o -> o.price<1000).count();
		System.out.println(l);
	}
		
}
