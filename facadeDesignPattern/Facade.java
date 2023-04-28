package facadeDesignPattern;

public class Facade {
	 ItemsPurchased I1;
	 ProcessSales P1;
	 Facade(boolean giftCard, double billAmount){
		 I1 = new ItemsPurchased();
		 I1.storePurchaseDetails();
		 int numItems = I1.getItemTypes();
		 System.out.println("Total number of items purchased : " + numItems);
		 System.out.println("Gift card status : " + giftCard);
		 P1 = new ProcessSales(giftCard, numItems, billAmount);
	 }
	 void displayItemsPurchased() {
		 I1.getItemsPurchased();
	 }
	void calculateAmountToPay() {
		 P1.processSales();
	 }
}