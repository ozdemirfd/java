public class staticTest {
	
	private static int numInstance=1;
	private String name;
	
	public staticTest(String name) {
		this.name=name;
		numInstance++;
	}
	
	public int getNumInstance() {
		return numInstance;
	}
	
	public String getName() {
		return name;
	}

}