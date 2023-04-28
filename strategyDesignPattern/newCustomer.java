package strategyDesignPattern;

public class newCustomer implements storeDiscount{
	 
	@Override
	 public double calcDiscount(double price) {
		double custDiscount = 0.15 * price;
		double totalDiscount = custDiscount;
		if (price >=2000){
			totalDiscount += fixedDiscount;
		}
		return totalDiscount;
	 }
}