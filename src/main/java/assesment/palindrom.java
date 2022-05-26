package assesment;

public class palindrom {

	public static void main(String[] args) {
		String str = "Radar";
		String Reverse = "";
		for(int i = str.length()-1; i>=0;--i) {
			 Reverse = Reverse + str.charAt(i);
			 
				 
				 
			 }
		if(str.toLowerCase().equals(Reverse .toLowerCase())){
			 System.out.println(str+ "yesss");
		}
			 else 
				 System.out.println("not palindrom");
		}

	}


