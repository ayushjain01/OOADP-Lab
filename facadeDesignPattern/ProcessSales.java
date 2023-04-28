package facadeDesignPattern;

import java.util.Scanner;

public class ProcessSales {
    boolean giftCard;
    int numItems;
    double billAmount;

    ProcessSales(boolean giftCard, int numItems, double billAmount) {
        this.giftCard = giftCard;
        this.numItems = numItems;
        this.billAmount = billAmount;
    }

    void processSales() {
        double giftCardValue, cashToPay, balance;
        Scanner sc = new Scanner(System.in);
        if (!giftCard) {
            System.out.println("Oops! You dont have a Gift Card");
            System.out.println("To pay : ₹ " + billAmount);
        } 
        else {
            System.out.println("Enter gift card value : ");
            giftCardValue = sc.nextDouble();
            if (numItems > 1) {
                System.out.println("You can only purchase one item worth ₹ " + giftCardValue);
                System.out.println("Purchased Items Count :  " + numItems + "\nGift Card not applicable");
                System.out.println("To pay : ₹ " + billAmount);
            } 
            else if (numItems <= 0)
                System.out.println("Please add one item to proceed");
            else if (giftCardValue < billAmount) {
                cashToPay = billAmount - giftCardValue;
                System.out.println("Bill amount : ₹ " + billAmount);
                System.out.println("Gift card discount : ₹ " + giftCardValue);
                System.out.println("To pay : ₹ " + cashToPay);
            } 
            else if (giftCardValue > billAmount) {
                balance = giftCardValue - billAmount;
                System.out.println("Bill amount : ₹ " + billAmount);
                System.out.println("Gift card discount : ₹ " + giftCardValue);
                System.out.println("To pay : ₹ 0");
                System.out.println("Non-refundable gift card balance : ₹ " + balance);
            }
        }
        sc.close();
    }
}