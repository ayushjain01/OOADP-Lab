package bridgeDesignPattern;

public class Client {
	public static void main(String[] args) { 
		  // TODO Auto-generated method stub 
		  Customer c1=new RegularCustomer("Modi", 34, new Discount1()); 
		  c1.showBill(100); 
		   
		  c1.setDiscount(new Discount2()); 
		  c1.showBill(100); 
		   
		  c1.setDiscount(new Discount3()); 
		  c1.showBill(100); 
		   
		  c1.setDiscount(new Discount4()); 
		  c1.showBill(100); 
		   
		  Customer c2=new FirstTimeCustomer("Raga", 6, new Discount1()); 
		  c2.showBill(100); 
		   
		  c2.setDiscount(new Discount2()); 
		  c2.showBill(100); 
		   
		  c2.setDiscount(new Discount3()); 
		  c2.showBill(100); 
		   
		  c2.setDiscount(new Discount4()); 
		  c2.showBill(100); 
		  
		  Customer c3=new SeniorCustomer("Maga", 61, new Discount1()); 
		  c3.showBill(100); 
		   
		  c3.setDiscount(new Discount2()); 
		  c3.showBill(100); 
		   
		  c3.setDiscount(new Discount3()); 
		  c3.showBill(100); 
		   
		  c3.setDiscount(new Discount4()); 
		  c3.showBill(100); 
		  }
}
