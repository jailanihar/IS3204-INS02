package week11;

public class LearningMatchingString {

	public static void main(String[] args) {
		String message = "IS3204 Programming Application";
		System.out.println(
				message.equals("IS3204 Programming Application"));
		System.out.println(message.equals("Programming"));
		// Regular Expression - regex
		System.out.println(message.matches(".*Programming.*"));
		System.out.println(message.matches(".......Programming.*"));
		System.out.println(message.matches("Programming.*"));
	}
	
}
