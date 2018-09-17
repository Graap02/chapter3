package debugging;

//This program calculates tuition bills as credits times rate per credit hour
public class FixDebugThree4
{
public static void main(String args[])
{
   int myCredits = 13;
   int yourCredits = 17;
   double rate = 75.84;
   System.out.println("My tuition:");
   tuitionBill(myCredits, rate);
   System.out.println("Your tuition:");
   tuitionBill(yourCredits, myCredits, yourCredits);
}
private static void tuitionBill(int myCredits, double rate) {
	// TODO Auto-generated method stub
	
}
public static void tuitionBill(int c, int myCredits, int r)
{
   System.out.println("Total due " + (r*c));
}
}
