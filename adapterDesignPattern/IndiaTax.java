
package adapterDesignPattern;

public class IndiaTax implements CalcTax{
	 double taxAmount = 0.0;
	 
	 @Override
	 public double taxAmount(String item, int quantity, double price) {
		 taxAmount = quantity * price * 0.05f;
	 	return taxAmount;
	 }
}