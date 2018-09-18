package youDoIt;

import java.util.Scanner;

public class SpaService {
	private String serviceDescription;
	private double price;
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{

	}
			
public void setServiceDescription(String service) 
{
	serviceDescription = service;
}
public void setPrice(double pr)
{
	price = pr;
}
public String getServiceDescription()
{
	return serviceDescription;
}
public double getPrice()
{
	return price;
}
}
public class CreateSpaServices{



	public static void main(String[] args) {
	
	String service;
	double price;
	
	spaService firstService = new SpaService();
	spaService secondService = new SpaService();
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter service >> ");
	service = keyboard.nextLine();
	System.out.print("Enter price >> ");
	price = keyboard.nextDouble();
	
	firstService.setServiceDescription(service);
	
	firstService.setPrice(price);
	
	keyboard.nextLine();
	System.out.print("Enter service >> ");
	service = keyboard.nextLine();
	System.out.print("Enter price >> ");
	price = keyboard.nextDouble();
	secondService.setServiceDescription(service);
	secondService.setPrice(price);
	


}
}






