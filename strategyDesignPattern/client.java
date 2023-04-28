package strategyDesignPattern;

import java.util.Scanner;

public class client {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Type of CUstomer \n1- Regular Customer\n2- Senior Citizen\n3- New Customer \nEnter : ");
		int type = sc.nextInt();
		System.out.println("Enter Total Bill Amount : ");
		double amount = sc.nextDouble();
		sc.close();
		if (type == 1){
			contextDiscount context = new contextDiscount(new regularCustomer());
			double discount = context.executeStrategy(amount);
			System.out.println("Discount- " + discount);
			System.out.println("Final Amount- " + (amount- discount));
		}
		else if (type == 2) {
			contextDiscount context = new contextDiscount(new seniorCustomer());
			double discount = context.executeStrategy(amount);
			System.out.println("Discount- " + discount);
			System.out.println("Final Amount- " + (amount- discount));
		}
		else if (type == 3){
			contextDiscount context = new contextDiscount(new newCustomer());
			double discount = context.executeStrategy(amount);
			System.out.println("Discount- " + discount);
			System.out.println("Final Amount- " + (amount- discount));
		}
		else
		{
			System.out.println("Invalid Customer Type.");
			System.exit(type);
		}
	}
}