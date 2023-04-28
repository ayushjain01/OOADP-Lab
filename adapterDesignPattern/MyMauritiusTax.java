
package adapterDesignPattern;

public class MyMauritiusTax implements CalcTax{

	MauritiusTax m1 = new MauritiusTax();
	double taxAmount=0.0;
	@Override
	 
	public double taxAmount(String item, int quantity, double price) {
		taxAmount = m1.calcTax(quantity, price);
		return taxAmount;
	 }
}