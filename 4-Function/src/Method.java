
public class Method {

	public static void main(String[] args) {
		method(4,5);
		System.out.println(method1(4,10));
		displayHighScorePosition("Mike",calculateHighScorePosition(1500));
		
	
	}
	
	public static void method(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
	}

	public static int method1 (int x,int y) {
		int sum=x+y;
		return sum;
	}
	
	
	public static void  displayHighScorePosition(String name,int score) {
		System.out.println(name+" managed to get into position on the high score table of "+score);
	}
	
	
	
	public static int calculateHighScorePosition(int score) {
		if(score >=1000) {
			return 1;
		}else if(score >=500 && score <1000) {
			return 2;
		}else if(score >=1000 && score <500) {
			return 3;
		}else {
			return 4;
		}
		
		
		
		
		
	}
	
	
	
}
