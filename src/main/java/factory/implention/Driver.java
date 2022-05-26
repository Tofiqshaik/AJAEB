package factory.implention;

import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		System.out.println("enter the shape for obj");
		String name = sc.next();
		Shape s = FactoryShape.getRef(name);
		s.println();
		System.out.println("done.......................!");
	}

}
