
public class Assignment_7 {

	public static void main(String[] args) {
		System.out.println(hasTeen(9,99,19));
		System.out.println(hasTeen(23,15,42));
		System.out.println(hasTeen(22,23,34));
		System.out.println(hasTeen(252,23,354));

	}
	
	public static boolean hasTeen(int a,int b,int c) {
		if((13<=a && a <=19) || (13<=b && b<=19) || (13<=c && c<=19)) {
			return true;
			
		}else {
			return false;
		}
	}

}
