import java.util.Arrays;
import java.util.Scanner;

public class task {

	
	public static void main(String[] args) {
//		
//		System.out.println(Arrays.toString(getIntegers(4)));
//		System.out.println(getAvarage(getIntegers(4)));
//
		System.out.println(Arrays.toString(myarray(4)));
		System.out.println(getavarage(myarray(4)));
	}
//	public static int[] getIntegers(int number) {
//		Scanner scanner=new Scanner(System.in);
//		 int[] myArr = new int[number];
//		 System.out.println("Enter your number");
//		
//		for(int a=0;a<myArr.length;a++) {
//			
//			myArr[a]= scanner.nextInt();
//			
//		}
//		return myArr;
//		
//	}

	
	public static int[] myarray(int num) {
		int [] array=new int[num];
		System.out.println("enter number");
		for( int a=0;a<num;a++) {
			Scanner scan=new Scanner(System.in);
			array[a]=scan.nextInt();
		}
		return array;
		
	}
	
	
	
	public static double getavarage(int[] array) {
		
	int sum=0;

	for( int a=0;a<array.length;a++) {
		sum=array[a]+sum;
	}
	return (double) sum/array.length;
	}

	
	
	
public static double getAvarage(int[] array) {
	
	int avr=0;
	for( int i=0;i<array.length;i++) {
		avr=avr+array[i];
	}
	return (double) avr/array.length;	
	
	
}




}
