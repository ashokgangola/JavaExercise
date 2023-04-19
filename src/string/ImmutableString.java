package string;

public class ImmutableString {

	public static void main(String[] args) {
		String s = new String("Hello");
		s.concat(" World");
		System.out.println(s); //Can't perform changes on existing object
	}
	
}
