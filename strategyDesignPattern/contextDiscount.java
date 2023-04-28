package strategyDesignPattern;

public class contextDiscount {
	 private storeDiscount storeDis;
	 public contextDiscount(storeDiscount storeDis){
		 this.storeDis = storeDis;
	 }
	 public double executeStrategy(double price){
		 return storeDis.calcDiscount(price);
	 }
}