import java.util.Arrays;

public class Assignment_20 {

	public static void main(String[] args) {
		

		int[] names = {1,2,3,4,5};
		System.out.println(Arrays.toString(names)) ;
		reverse(names);;
		
	}
	public static void reverse(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
			
		}

		System.out.println(Arrays.toString(array));
	}
	
	
	
}
	



