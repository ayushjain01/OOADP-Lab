package adapterDesignPattern;

public class Item {
	 String name;
	 double price = 0.0;
	 int quantity = 0;
	 double billAmount = 0.0;
	 CalcTax ct;
	 Item(String name, double price, CalcTax c1) {
		 this.name = name;
		 this.price = price;
		 this.ct = c1;
	 }
	 void setTax(CalcTax c1) {
		 this.ct = c1;
	 }
	 void setQuantity(int quantity) {
		 this.quantity = quantity;
	 }
	 void printDetails() {
		 double tax = ct.taxAmount(name,quantity,price);
		 this.billAmount = price * quantity + tax;
		 System.out.println("Tax = " + tax);
		 System.out.println("Item : " + name);
		 System.out.println("Quantity : " + quantity);
		 System.out.println("Unit price : " + price);
		 System.out.println("Total Amount : " + billAmount);
	 }
}