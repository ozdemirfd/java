
public class Assignment_3 {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(2050);

	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes< 0) {
			System.out.println("Invalid Value");
		}
		int MB= kiloBytes/1024;
		int KB=kiloBytes%1024;
		System.out.println(kiloBytes+" KB = "+MB+"MB and "+KB+"KB");

	}

}
