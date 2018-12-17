import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		printNumber();

	}
	
	public static void printNumber() {
		Scanner sn=new Scanner(System.in);
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		while(true) {
			System.out.println("Enter number");
			boolean isanInt=sn.hasNextInt();
		  
			if(isanInt) {
				int number=sn.nextInt();
			if(number>max) {
				max=number;
			}
			if(number<min) {
				min=number;
			}
				
				
			}else {
				break;
			}
			
		}
		System.out.println("min= "+ min+", max = "+max);
	}
}

