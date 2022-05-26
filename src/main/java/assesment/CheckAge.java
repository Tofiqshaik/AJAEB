package assesment;

import java.util.Scanner;

public class CheckAge {
	public static void getAge(int age) {
		if(age>21) {
			System.out.println("your Eligiable for marriage");
		}
		else {
			throw new NotEligable();
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the age");
		int age= scn.nextInt();
		getAge(age);
	}

}
