package bridgeDesignPattern;

public class RegularCustomer extends Customer {
    public RegularCustomer(String name, int age, Discount d) {
        super(name, age, d);
        typeOfCust = "Regular Customer";
    }
}