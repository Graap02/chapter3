package excercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		double gpa;
		System.out.print("Please enter your name >> ");
		name = input.nextLine();
		System.out.print("Please enter your grade point average >> ");
		gpa = input.nextDouble();
		
		double credit;	
		credit = gpa * 10;
		
		System.out.println(name + " has a " + gpa + " grade point average, which accumulates to " +
		credit + "$ in store credit to the bookstore.");


	}

}
