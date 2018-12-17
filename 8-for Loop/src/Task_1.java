
public class Task_1 {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		for(int a=1;a<=1000;a++) {
			
		if(a%3==0 && a%5==0) {
			sum=sum+a;
			count++;
			if(count==5) {
				break;
			}
		}
			
		}
	    System.out.println(sum);
		
	}

}
