package singleTon;

public class Student {
	static Student obj;
	String name="vaibhav";
   private Student () {
	   super();
   }   
	public static Student getRef() {
		if(obj==null) 
			obj=new Student();
			return obj;
	}
	}
