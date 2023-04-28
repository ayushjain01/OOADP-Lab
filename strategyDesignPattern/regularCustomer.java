package strategyDesignPattern;

public class regularCustomer implements storeDiscount{
	 
	@Override
	 public double calcDiscount(double price) {
		double custDiscount = 0.12 * price;
		double totalDiscount = custDiscount;
		if (price >=2000){
			totalDiscount += fixedDiscount;
		}
		return totalDiscount;
	 }
}
