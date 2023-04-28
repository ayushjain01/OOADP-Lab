package bridgeDesignPattern;

public class FirstTimeCustomer extends Customer {

    public FirstTimeCustomer(String name, int age, Discount d) {
        super(name, age, d);
        typeOfCust = "First Time Customer";
        // TODO Auto-generated constructor stub 
    }

}