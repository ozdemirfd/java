
public class Assignment_14 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		
	}

	public static boolean isPalindrome(int number) {
		  if(number<0){
	            number=number*(-1);
	        }
		String str="";
		int num=number;
		while(number>0) {
			int reserve=number%10;
			str=str+reserve;
			number=number/10;
		}
			
		 int newN=Integer.parseInt(str);
			if(num==newN) {
				return true;
			}else {
				return false;
			}
	
		
	}	
	
}
