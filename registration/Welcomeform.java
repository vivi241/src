

package registration;

import java.util.Scanner;  // Import Scanner for user input


public class Welcomeform {
	
	public static void main(String[] args) {
		
		
		// Create a Scanner object to read input from the keyboard
		Scanner input = new Scanner(System.in);
		
		
		// Ask the user for their first name
		System.out.println("Enter your first name:");
		String firstName = input.nextLine();
		
		
		// Ask the user for their age
		System.out.println("Enter your age: ");
		int age =input.nextInt();
		
		
		// Display a welcome message using the user's input
		System.out.println("\nWelcome, " + firstName + "! You are " + age + " years old.");
		
		// Close the Scanner to prevent resource leaks
		input.close();
		
	}
	

}
