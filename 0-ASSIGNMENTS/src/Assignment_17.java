import java.util.Scanner;

public class Assignment_17 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int preNumber;
		
		while(true) {
			
			preNumber=scanner.nextInt();
			if(preNumber>=0) {
				break;
			}else {
				continue;
			}
		}
		
		int max=preNumber;
		int min=preNumber;
		
		while(true) {
			int number=scanner.nextInt();
			if(number>=0) {
				if(number>max) {
					max=number;
				}else if(number<min) {
					min=number;
				}
			}else {
				break;
			}
		}
		System.out.println("The maximum value is "+max);
		System.out.println("The minimum value is "+min);
		
		scanner.close();
	}

}