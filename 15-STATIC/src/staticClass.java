
public class staticClass {

	public static void main(String[] args) {
		staticTest static1= new staticTest("instance-1");
		System.out.println(static1.getName()+" is isyance number "+ static1.getNumInstance());

		staticTest static2 = new staticTest("instance-2"); 
		System.out.println(static2.getName()+" is instance number"+ static2.getNumInstance());
		
		staticTest static3 = new staticTest(null); 
		System.out.println(static3.getName()+" is instance number"+ static3.getNumInstance());
	}
	
		
		
	}


