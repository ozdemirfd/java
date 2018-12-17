
import java.util.Arrays;
import java.util.Scanner;

public class Assigment_18 {

	public static void main(String[] args) {
	System.out.println(sortIntegers(getIntegers(3)));

	}
	
	
	public static int[] getIntegers(int num) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number");
		int[] array= new int [num];
		
		for(int x=0;x<array.length;x++) {
			
			array[x]= scanner.nextInt();
		}
		return array;
		
	}
	
	
	public static String sortIntegers(int[] array) {
		
		
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array.length; j++) {
		        if (array[j] < array[i]) {
		            int min = array[j];
		            array[j] = array[i];
		            array[i] = min;
		        }
		    }
		}
	     //Arrays.sort(array);
		
	
	
		return Arrays.toString(array);
			
	}

}
