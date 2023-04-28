package observerDesignPattern;

import java.util.ArrayList;

public class Store extends Subject {

    float discount;
    String name;
    ArrayList < Observer > ol;
    public Store(String name, float discount) {
        this.name = name;
        this.discount = discount;
        ol = new ArrayList < Observer > ();
    }
    @Override
    void register(Observer o) {
        ol.add(o);
        System.out.println("Added Customer " + o + " to Store " + name);
    }
    @Override
    void unregister(Observer o) {
        try {
            ol.remove(ol.indexOf(o));
            System.out.println("Removed Customer " + o + " from store " + name);
        } catch (NullPointerException e) {
            // TODO: handle exception 
            System.out.println("No such Customer called " + o + " in store " + name);
        }

    }

    @Override
    void notifyObservers() {
        for (Observer o: ol)
            o.update(discount);

    }
    void setDiscount(String festival, float d) {
        discount = d;
        System.out.println("New Discount Offer on Account of " + festival);
        notifyObservers();
    }
}