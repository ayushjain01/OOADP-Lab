package facadeDesignPattern;

import java.util.*;

public class ItemsPurchased {
	HashMap<String,Integer> Items;
	int itemTypes;
	ItemsPurchased() {
		Items = new HashMap<String,Integer>();
	}
	
	int getItemTypes() {
		return this.itemTypes;
	}
	void getItemsPurchased() {
		System.out.println("---------------------Items Purchased---------------------");
		System.out.println(List.of(Items));
	}
	void storePurchaseDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of item types bought : ");
		itemTypes = sc.nextInt();
		for(int i=0; i<itemTypes; i++) {
			System.out.println("For item : "+(i+1));
			System.out.println("Enter mame : ");
			String name = sc.next();
			System.out.println("Enter Quantity : ");
			Integer qty = sc.nextInt();
			Items.put(name, qty);
		sc.close();
		}
	}
}