
public class Assignment_10 {

	public static void main(String[] args) {
		printYearsAndDays(561600); 

	}
	
	public static void printYearsAndDays(int minutes) {
		if(minutes<0) {
			System.out.println("invalid Value");
		}else {
			int year= minutes/(365*24*60);
			int remain=minutes%(365*24*60);
			int day=remain/(24*60);
	
			System.out.println(minutes +" minutes = "+ year+" y "+ day +" d " );
		}
		
	}

}
