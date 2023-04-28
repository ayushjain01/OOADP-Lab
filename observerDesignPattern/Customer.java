package observerDesignPattern;

public class Customer extends Observer {

    Subject store;
    float discount;
    String name;
    public Customer(Subject subject, String name) {
        this.name = name;
        store = subject;
        store.register(this);
    }
    @Override
    void update(float discount) {
        this.discount = discount;
        System.out.println(name + " gets a discount of " + discount + "%");
    }

    public String toString() {
        return name;
    }

}