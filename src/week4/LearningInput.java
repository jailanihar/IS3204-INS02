package week4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearningInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please input a message: ");
//		String message = scanner.nextLine();
//		System.out.println("You have typed: " + message);
//		message = scanner.nextLine();
//		System.out.println("You have typed: " + message);
		
//		System.out.println("Please input a message: ");
//		String message = scanner.next();
//		System.out.println("You have typed: " + message);
//		message = scanner.next();
//		System.out.println("You have typed: " + message);
		
//		System.out.println("Welcome to our simple addition calculator.");
//		System.out.println("Please input two whole number to be added.");
//		System.out.println("Please input the first value: ");
//		int a = scanner.nextInt();
//		System.out.println("Please input the second value: ");
//		int b = scanner.nextInt();
//		System.out.println(a + " + " + b + " = " + (a+b));
		
//		try {
//			System.out.println("Welcome to Pythagoras Theorem Calculator.");
//			System.out.println("This can only calculate the hypotenuse length.");
//			System.out.println("Please input the first value: ");
//			double a = scanner.nextDouble();
//			System.out.println("Please input the second value: ");
//			double b = scanner.nextDouble();
//			System.out.println("The result for a = " + a + " and b = " + b + " is:");
//			double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//			System.out.printf("%.2f%n", c);
//		} catch (InputMismatchException e) {
//			System.out.println("You have typed the wrong input.");
//			System.out.println("Expected input double data type.");
//			System.out.println("Application is terminated.");
//		}
		
		try {
			System.out.println("Please input an integer number:");
			String a = scanner.nextLine();
			System.out.println("Please input another integer number:");
			String b = scanner.nextLine();
			System.out.println(a + b);
			int aToInt = Integer.parseInt(a);
			int bToInt = Integer.parseInt(b);
			System.out.println(aToInt + bToInt);
		} catch (NumberFormatException e) {
			System.out.println("You have typed the wrong input.");
			System.out.println("Expected input double data type.");
			System.out.println("Application is terminated.");
		}
	}
	
}
