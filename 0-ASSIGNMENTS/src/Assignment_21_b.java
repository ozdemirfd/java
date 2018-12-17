
public class Assignment_21_b {
	private static String name;
	private static double limit;
	private static String email;
	

	public Assignment_21_b() {
		this(email,name,limit);
		
			
	}
	

	public Assignment_21_b(String email, String name, double limit) {
		this.email=email;
		this.limit=limit;
		this.name=name;
	}


	public String getName() {
		return name;
	}



	public double getLimit() {
		return limit;
	}



	public String getEmail() {
		return email;
	}

}
