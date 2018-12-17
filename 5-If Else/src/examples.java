
public class examples {

	public static void main(String[] args) {
		
		    displayHighScorePosition("mike", calculateHighScorePosition(600));
		    displayHighScorePosition("John", calculateHighScorePosition(900));
	        displayHighScorePosition("Dan", calculateHighScorePosition(400));
	        displayHighScorePosition("Sam", calculateHighScorePosition(50));
	        
	    	int highScorePosition=calculateHighScorePosition(1500);
			displayHighScorePosition("Mike", highScorePosition);
			
			highScorePosition=calculateHighScorePosition(900);
			displayHighScorePosition("Smith", highScorePosition);
			
			highScorePosition=calculateHighScorePosition(400);
			displayHighScorePosition("Anna", highScorePosition);
		
	 	int income=150_000_000;
		
	     if (income <= 150_000_000) {
	    	 System.out.println(income*0.25);
			}else if(income>150_000_000 && income<=300_000_000) {
				System.out.println (income*0.30);
			}else if (income>150_000_000 && income<=600_000_000){
				System.out.println (income*0.35);
			}else if (income>600_000_000 && income<=1200_000_000){
				System.out.println (income*0.40);
			}else if (income>1200_000_000){
				System.out.println(income*0.50);
			}

	    
	}
	
	
	public static void displayHighScorePosition(String name,int score) {
		System.out.println(name+" menaged to get into position "+ score+" on the high score table" );
	}
	
	public static int calculateHighScorePosition(int score) {
		if(score>=1000) {
			return 1;
			
		}else if(score>=500 && score<1000) {
			return 2;
		}else if(score>=100 && score<500) {
			return 3;
		}else {
			return 4;
		}
	}
	

	}


