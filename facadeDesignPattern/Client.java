package facadeDesignPattern;

import java.util.Scanner;
public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount : ");
		double billAmount = sc.nextDouble();
		System.out.println("Do you have a gift card(true/false)? : " );
		boolean value = sc.nextBoolean();
		Facade fc = new Facade(value, billAmount);
		fc.calculateAmountToPay();
		fc.displayItemsPurchased();
		sc.close();
	}
}