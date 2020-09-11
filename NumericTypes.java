package NumericTypes;
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
		//int score1 = 100; // first test score
		//int score2 = 95; // second test score
		int score1, score2, score3;
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		System.out.println("Enter a score: ");
		score1 = keyboard.nextInt();
		
		System.out.println("Enter another score: ");
		score2 = keyboard.nextInt();
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = 5/9 * (BOILING_IN_F - 32);
		output = "The temperature in which water boils is " + BOILING_IN_F + " in Fahrenheit or " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.println("Enter a temperature: ");
		score3 = keyboard.nextInt();

		fToC = 5/9.0 * (score3 - 32);
		output = score3 + " in Celsius is " + fToC;
		
		System.out.println(output);
	
		System.out.println("Goodbye"); // to show that the program is ended	
		keyboard.close();
	}
}