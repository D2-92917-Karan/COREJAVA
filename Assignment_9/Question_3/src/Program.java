import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> fruits =new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Mango");
		
		System.out.println("Before Replace:"+fruits);
		fruits.set(1,"Orange");
		
		System.out.println("After Replace:"+fruits);
	}

}
