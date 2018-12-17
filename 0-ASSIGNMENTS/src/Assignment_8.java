
public class Assignment_8 {

	public static void main(String[] args) {
		
		getDurationString(4600);

	}
	
	public static int getDurationString(int minutes,int seconds) {
		if(minutes>=0) {
			if(seconds>=0 && seconds<=59) {
				int hours=minutes/60+seconds/3600;
				System.out.println(hours+ " hours "+ minutes%60 +" minutes "+ seconds%3600+ " seconds ");
				return hours;
				
				
			}else {
				System.out.println("invalid");
				return -1;
			
			}
		}else {
			System.out.println("invalid");
			return -1;
		}
		
	
	}
	
	public static int getDurationString(int seconds) {
		if(seconds<=0) {
			System.out.println("invalid");
			return -1;
			
			
			
		}else {
			
			int dk=seconds/60;
			int remain=seconds%60;
			
			return getDurationString(dk,remain);
			
		}
		
	}

}
