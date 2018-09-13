package excercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 5;
		double y = 12;
		computePercent(x, y);

	}
public static void computePercent(double x, double y) {
	Scanner input = new Scanner(System.in);
	double compute;
	double x2;
	double y2;
	
	System.out.println("Please input a number >>");
	double x1 = input.nextDouble();
	System.out.println("Please input a number >>");
	double y1 = input.nextDouble();
	
	compute = (x1 / y1) * 100;
	System.out.println("The answer is " + compute + "%");
}
}
