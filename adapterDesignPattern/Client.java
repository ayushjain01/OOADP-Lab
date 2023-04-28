
package adapterDesignPattern;

public class Client {

	public static void main(String[] args) {
		 IndiaTax c1 = new IndiaTax();
		 Item i1 = new Item("Cricket Bat", 1875.60, c1);
		 i1.setQuantity(10);
		 System.out.println("---------------=India Tax----------------");
		 i1.printDetails();
		 System.out.println();
		 MyMauritiusTax c2 = new MyMauritiusTax();
		 System.out.println("--------------Mauritius Tax--------------");
		 i1.setTax(c2);
		 i1.printDetails();
	}
}