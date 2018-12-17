
public class exam {

	public static void main(String[] args) {
		
		
		calculate("feride",60);
		calculate();
		calculate(60);
	}
	
	public static void calculate(String playerName,int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
	
	}
	

	
	public static void calculate() {
		System.out.println("No  Name, No Score");
	}
	
	public static void calculate(int score) {
		System.out.println(" Player Scored " + score + " points");
		
	}
	


}


