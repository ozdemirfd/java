
public class Assignment_15 {

	public static void main(String[] args) {
	System.out.println(sumFirstAndLastDigit(234));
	System.out.println(sumFirstAndLastDigit(257));
	System.out.println(sumFirstAndLastDigit(0));
	System.out.println(sumFirstAndLastDigit(5));
	System.out.println(sumFirstAndLastDigit(-10));
	}
	public static int sumFirstAndLastDigit(int num) {
		if(num<0) {
			return -1;
		}
		int sum=0;
		int count=0;
        while(num>0) {
        	int modul=num%10;
        	count++;
        	num=num/10;
        	
        	if(count==1 || num==0) {
        		sum=sum+modul;
        	}
        }
		return sum;
		
		
	}

}
