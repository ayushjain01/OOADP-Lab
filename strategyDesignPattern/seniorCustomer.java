package strategyDesignPattern;

public class seniorCustomer implements storeDiscount{
	 
	@Override
	 public double calcDiscount(double price) {
		double custDiscount = 0.10 * price;
		double totalDiscount = custDiscount;
		if (price >=2000){
			totalDiscount += fixedDiscount;
		}
		return totalDiscount;
	 }
}
