package excercises;

import java.util.Scanner;

public class Testlbls 
{
	public static void main(String[] args) 
	{
		double x;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your weight >> ");
		x = input.nextDouble();
		displayPoundstoOunces(x);
		displayPoundstoKilos(x);
		displayPoundstoMilligrams(x);
	}
public static void displayPoundstoOunces(Double x) {
	double ounces;
	
	ounces = x * 16;
	int x2 = (int) ounces;
	displayWeight(x2);
}
public static void displayPoundstoKilos(Double x) {
	double kilos;
	
	kilos = x * .45359237;
	int x2 = (int) kilos;
	displayWeight(x2);
}
public static void displayPoundstoMilligrams(Double x) {
	double milligrams;
	
	milligrams = x * 453592.37;
	int x2 = (int) milligrams;
	displayWeight(x2);
}
public static void displayWeight(int x2) {
	System.out.println("You weigh " + x2 + " in ounces, " + x2 + " in kilos, and " + x2 + " in milligrams.");
}




}
