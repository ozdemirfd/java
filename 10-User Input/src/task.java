import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		int count=1;
		while( count <11) {
		System.out.println("Enter a int value: " +count );
	
		boolean has=scanner.hasNextInt();
		if(has) {
			int i1 = scanner.nextInt();
			sum=sum+i1;
			count++;
		}else {
	          System.out.println("Invalid value added");
		}
		scanner.nextLine();
		
	}
		System.out.println(count+ " number added  and sum = " +sum);
		scanner.close();
		
		
		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("enter your valid number");
//		int sum=0;
//		int count=0;
//		while(count<11) {
//			
//			boolean has=scan.hasNextInt();
//			if(has) {
//				int input=scan.nextInt();
//				sum=sum+input;
//				count++;
//			}else {
//				scan.nextLine();
//			}
//			
//		}
//		
//		System.out.println(sum);
//		scan.close();
//	
		
	}
}
