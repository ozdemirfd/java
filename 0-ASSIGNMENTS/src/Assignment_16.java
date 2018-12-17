
public class Assignment_16 {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));
		

	}
	
	public static int getEvenDigitSum(int num) {
		if(num<0) {
			return -1;
		}
		int sum=0;
		while(num>0) {
			int remain=num%10;
			num=num/10;
			if(remain%2==0) {
				sum=sum+remain;
			}
			
		}
		return sum;
	}

}
