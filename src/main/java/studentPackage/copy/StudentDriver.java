package studentPackage.copy;

public class StudentDriver {
	public static void main(String[] args) {
		Student s =Student.getRef();
		Student s1  = Student.getRef();
        System.out.println(s.name);
	    System.out.println(s1.name);
		//System.out.println(s1.equals(s));
	}

}
