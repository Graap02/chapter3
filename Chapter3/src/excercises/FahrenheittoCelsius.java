package excercises;

import java.util.Scanner;

public class FahrenheittoCelsius 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double ftemp;
		double ftemp2;
		double ftemp3;
		double Celsius;
		double Celsius2;
		double Celsius3;
		double average;
		
		
		
		System.out.println("What is the temperature at 8? ");
		ftemp = input.nextDouble();
		Celsius = (ftemp - 32) * 5/9;
	
		System.out.println("The temperature in celsius is " + Celsius);
		
		
		System.out.println("What is the temperature at Noon? ");
		ftemp2 = input.nextDouble();
		Celsius2 = (ftemp2 - 32) * 5/9;
	
		System.out.println("The temperature in celsius is " + Celsius2);
		
		System.out.println("What is the temperature at 5? ");
		ftemp3 = input.nextDouble();
		Celsius3 = (ftemp3 - 32) * 5/9;
		System.out.println("The temperature in celsius is " + Celsius3);
		
		average = ftemp + ftemp2 + ftemp3 / 3;
		displayAverage(average);
	}	
	
		public static void displayAverage(double average)  
		{
			System.out.println("The average today is going to be " + average);
		}
}