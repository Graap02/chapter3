package excercises;

import java.util.Scanner;

public class MetricConversion 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int x;
		System.out.println("Please input an integer >> ");
		x = input.nextInt();
		String message;
		double centimeters;
		double liters;
		centimeters = x * 2.54;
		liters = x *3.785411784;
		
		System.out.println("Your number of centimeters from inches is " + centimeters);
		System.out.println("Your number of liters from gallons is " + liters);
		
		message = "Best of luck to you on your measurements!";
		displayMessage(message);
	}
	public static void displayMessage(String message)
	{		
		System.out.println(message);
	}
}



