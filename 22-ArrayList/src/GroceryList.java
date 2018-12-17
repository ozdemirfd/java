import java.util.*;

//import java.util.ArrayList;
//import java.util.List;



public class GroceryList {
	//List groceryList=new ArrayList();
	List<String> groceryList=new ArrayList<String>();
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	public void printGroceryList() {
		System.out.println("you have "+ groceryList.size()+" items in your grocery list");
		for (int i=0;i<groceryList.size();i++) {
			System.out.println((i+1)+". "+ groceryList.get(i));
		}
	}
	public void modifyGroceryItem(int position,String newItem) {
		groceryList.set(position, newItem);
	}

    public void removeGroceryItem(int position) {
	//String theItem=groceryList.get(position);
	groceryList.remove(position);
}

    public String findItem(String searchItem) {
	//boolean exists=groceryList.contains(searchItem);
	int position=groceryList.indexOf(searchItem);
	if(position>=0) {
		return groceryList.get(position);
		}
	 return null;
	}
	
		
	}
	



