import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList grocery = new GroceryList();

	public static void main(String[] args) {
		
		boolean quit=false;
		int choice=0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice:");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				grocery.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
			modifyItem();
				break;
			case 4:
			removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit=true;
				break;
			}
			
		}
		
	}

	public static void printInstructions() {
	       System.out.println("0:Print Instructions\n1:"
	    + "Print Grocery list\n2:Add items\n"
	    + "3:Modify Items\n4:Remove Items\n5:Search items \n6:Quit");
		
	}
	
	public static void addItem() {
		System.out.println("Enter your item");
		String item= scanner.nextLine();
		grocery.addGroceryItem(item);
		
		
	}
	 public static void modifyItem() {
		 System.out.println("Chance  your item number");
		 int modifynumber=scanner.nextInt();
		 scanner.nextLine();
		 System.out.println("Choose please enter new item ");
		 String newItem=scanner.nextLine();
		 grocery.modifyGroceryItem(modifynumber, newItem);
	 }
	
	public static void removeItem() {
		System.out.println("Please enter number of grocery to remove");
		int remove=scanner.nextInt();
		grocery.removeGroceryItem(remove-1);
	}
	
	public static void searchForItem() {
		System.out.println("Please enter item to search");
		String search=scanner.nextLine();
		System.out.println("Your item position is "+grocery.findItem(search));
		
		
	}
	
}

//public static void modifyItem(){
//    System.out.println("Modify please enter number of grocery ");
//    int position=scanner.nextInt();
//    scanner.nextLine();
//    System.out.println("Modify please enter new item ");
//    String newItem=scanner.nextLine();
//    groceryList.modifyGroceryItem(position-1,newItem);
//
//}
//public static void removeItem(){
//    System.out.println("Please enter number of grocery to remove");
//    int position=scanner.nextInt();
//    groceryList.removeGroceryItem(position-1);
//}
//public static void searchForItem(){
//    System.out.println("Please enter item to search");
//    String item=scanner.nextLine();
//    String position=groceryList.findItem(item);
//    System.out.println("Searched item returned value "+position);
//}
//}
//public static void addItem(){
//    System.out.println("Add ITEM ");
//    String addItem=scanner.nextLine();
//    grocery.addGroceryItem(addItem);
//}

