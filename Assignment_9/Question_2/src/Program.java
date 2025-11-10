import java.util.ArrayList;
import java.util.Collections;

public class Program {
	public static void main(String[] args) {
		ArrayList<String> Colors= new ArrayList<>();
		Colors.add("Red");
		Colors.add("Orange");
		Colors.add("Blue");
		Colors.add("Black");
		Colors.add("White");
		Colors.add("Pink");
		Colors.add("Green");
		
		System.out.println("Array:"+Colors);
		
		Collections.sort(Colors);
		
		System.out.println("Sorted Array:"+Colors);
	}
}
