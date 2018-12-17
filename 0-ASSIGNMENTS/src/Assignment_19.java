import java.util.Arrays;
import java.util.Scanner;

public class Assignment_19 {

	public static void main(String[] args) {
		
		
		
		System.out.println(findMind(readIntegers(4)));

	}
	

	public static int[] readIntegers(int num) {
		Scanner input=new Scanner(System.in);
		
	   System.out.println("Enter your number");
	 
	    int[] array=new int[num];
	    for(int x=0;x<num;x++) {
	    	array[x]=input.nextInt();
	    	 
	    }
	    input.close();
	    return array;
	 
	  
	}
	
	 
	 
	  public static int findMind(int[] array) {
		  int min=array[0];
		  for(int x=0;x<array.length-1;x++) {
				  if(array[x]<min) {
					  min=array[x];
					  
			  }
			  
		  }
		return min;
	  }
	  
	  
	  

}
