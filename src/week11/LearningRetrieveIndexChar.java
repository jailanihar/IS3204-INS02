package week11;

public class LearningRetrieveIndexChar {

	public static void main(String[] args) {
		String message = "Programming Java Application";
		// Retrieve the index of first instance of letter a
		int firstInstanceA = message.indexOf("a");
		System.out.println(firstInstanceA);
		// Retrieve the index of last instance of letter a
		int lastInstanceA = message.lastIndexOf("a");
		System.out.println(lastInstanceA);
		
		String subMessage =
				message.substring(firstInstanceA, lastInstanceA+1);
		System.out.println(subMessage);
		
		int firstInstanceJava = message.indexOf("Java");
		System.out.println(firstInstanceJava);
		
		if(firstInstanceJava == -1) {
			System.out.println("Java is not in the word " 
					+ message);
		} else {
			System.out.println("Java is in the word " + message);
			System.out.println("In index: " + firstInstanceJava);
		}
	}
	
}



