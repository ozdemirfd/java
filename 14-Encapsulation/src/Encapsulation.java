
public class Encapsulation {

	public static void main(String[] args) {
		Car porsche= new Car ();
		porsche.setModel("911");
		System.out.println(porsche.getModel());
		
		
		String model=porsche.getModel();
		System.out.println(model);
		
		
		Car passat= new Car ();
		passat.setModel("A1");
		System.out.println(passat.getModel());
		
		
		String model1=passat.getModel();
		System.out.println(model1);
		

	}

}
