
public class task3 {

	public static void main(String[] args) {
		
		MegaBytesAndKiloBytes(-2 );
		MegaBytesAndKiloBytes(2050 );
	}
	
	public static void MegaBytesAndKiloBytes(int kiloBytes ) {
		if(kiloBytes<0) {
			System.out.println("invalid");
		}
		
		
		else {
		int MB=kiloBytes/1024;
		int KB=kiloBytes%1024;
		System.out.println(kiloBytes +" KB = "+ MB +" MB "+ KB+ " KB");
	}
	
	}

}
