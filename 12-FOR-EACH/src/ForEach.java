import java.util.Arrays;

public class ForEach {

	public static void main(String[] args) {
		int[] marks= {123,124,125,126};
		int highest_marks= maximum(marks);
		System.out.println(highest_marks);
		System.out.println(maximum(marks));

	}
	
	
	public static int maximum(int[] array) {
		int max=array[0];
		for(int num:array) {
			if(num>max) {
				max=num;
			}
		}
		return max;
	}
	

}
