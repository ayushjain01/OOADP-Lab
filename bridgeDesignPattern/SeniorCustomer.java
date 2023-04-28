package bridgeDesignPattern;

public class SeniorCustomer extends Customer {
    public SeniorCustomer(String name, int age, Discount d) {
        super(name, age, d);
        typeOfCust = "Senior Customer";

    }
}