package interFace;

import java.util.ArrayList;
import java.util.List;

public class For_each_loop_using_lamda_exp {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("vaibhav");
		names.add("naresh");
		names.add("tusher");
		names.add("1234");
		names.forEach((n) -> {
			System.out.println(n);
		});

	}

}
