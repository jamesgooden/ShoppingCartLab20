import java.util.ArrayList;
import java.util.Scanner;

public class Lab20shoppinglist {









	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//        String userChoice;
     
System.out.println("Welcome to Guenthers Market!");
System.out.println ("Item" + "      " + "Price");
System.out.println("======================");


populateMenu();

	  

	}
	
	

	
	
	
	
		public static  void populateMenu() {
			Scanner scan = new Scanner(System.in);
	        String userChoice;
	     String   userContinue ;
			ArrayList<String> itemList = new ArrayList<>();
			itemList.add("apple");
			itemList.add("banana");
			itemList.add("cauliflower");
			itemList.add("dragonfruit");
			itemList.add("elderberry");
			itemList.add("figs");
			itemList.add("grapefruit");
			itemList.add("honeydew");

			ArrayList<Double> itemPrices = new ArrayList<>();
			itemPrices.add(0.99);
			itemPrices.add(0.59);
			itemPrices.add(1.59);
			itemPrices.add(2.19);
			itemPrices.add(1.79);
			itemPrices.add(2.09);
			itemPrices.add(1.99);
			itemPrices.add(3.49);
			ArrayList<String> shoppingList = new ArrayList<>();
			ArrayList<Double> shopPrices = new ArrayList<>();
		

	  do {
			for (int i = 0; i < itemList.size(); i++) {
				System.out.println(itemList.get(i) + "  $" + itemPrices.get(i));

			}

			System.out.println("What item would you like to order?");
			 userChoice = scan.next();
			
			int i = 0;
			for (i = 0; i < itemList.size(); i++) 

		
		
  
				if (itemList.get(i).equalsIgnoreCase(userChoice)) {
					shoppingList.add(itemList.get(i));
				    shopPrices.add(itemPrices.get(i));
				System.out.println("Adding " + itemList.get(i) + " to cart at " +itemPrices.get(i));
				}
			
				
			
            System.out.println("Would you like to order anything else?");
			userContinue = scan.next();
			}  while (userContinue.equalsIgnoreCase("Y"));
	  
	  System.out.println("Thank you for your order!");
	  System.out.println ("Here's whats in your cart");
	  for (int i = 0; i < shoppingList.size(); i++) {
			System.out.println(shoppingList.get(i) + "$ " + shopPrices.get(i));
	  }

	scan.close();
			
	  	
		}		
	



}





