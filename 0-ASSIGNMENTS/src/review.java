
public class review {

	public static void main(String[] args) {
		printevenNumber();
	}
	
	
	public static void printevenNumber() {
		
		int count=0;
		String sum="";
		 for(int a=10;a<=100;a++) {
			 if(evenNumber(a)) {
				 sum=sum+" - "+a;
				 count++;
				 
				 if(count==5) { 
					 System.out.println(sum);
					 break;
				 }
			 }
			 
		 }
	}
	
	
	
	public static boolean evenNumber(int a) {
		if(a%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
