package computer;

public class Main {

	public static void main(String[] args) {
		
		
		Dimensions theDimensions = new Dimensions (20,20,5);
		Case theCase = new Case("2208", "Dell", "240", theDimensions);
		
		Monitor theMonitor = new Monitor("27inc beast", "Acer", 27, new Resolution(2540, 1440));
		Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
		
		
		
		pc p2= new pc(theCase,theMonitor,theMotherboard);
	
	    pc p1=  new pc(new Case("2208", "Dell","240",new Dimensions(20, 20, 5) ),
			 new Monitor("27inch beast","Acer", 27, new Resolution(2540,1440)),
			 new Motherboard("BJ-200", "Asus", 4, 6, "v2.44"));
	    
	         p1.getTheMonitor().drawPixelAt(1500, 1200, "red");
	        System.out.println(p1.getTheMonitor().getManufacturer()); 
	        System.out.println(p1.getTheMonitor().getModel());
	        p1.getTheMotherboard().loadProgram("windows 1.0");
	        System.out.println(p1.getTheCase().getPowerSupply());

	}

}
