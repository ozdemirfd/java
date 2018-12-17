
public class Assignment_13 {

	public static void main(String[] args) {
	
		System.out.println(sumOdd(1,100));
		System.out.println(sumOdd(-1,100)); 
		System.out.println(sumOdd(100,100));
		System.out.println(sumOdd(100,-100)); 
		System.out.println(sumOdd(100,1000));
	}
	
	public static boolean isOdd(int number) {
		if(number>0) {
			if(number%2==1) {
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
	
	public static int sumOdd(int start,int end) {
		if(end>=start && (start>0 && end >0)) {
			int sum=0;
			for(int a=start;a<=end;a++) {
				if(isOdd(a)) {
					sum=sum+a;
				}
				
			}
			return sum;
		
		}else {
			return -1;
		}
		
	}
	
}


