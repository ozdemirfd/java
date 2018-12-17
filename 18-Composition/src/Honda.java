
public class Honda extends Car {
	
	private Engine engine;
	private int door;
	
	public Honda(String color, int maxSpeed,int door,Engine engine) {
		super(color, maxSpeed);
		this.engine =engine;
		this.door=door;

	}



	public void startHonda() {
		engine.start();
	}



	public int getDoor() {
		return door;
	}



	public void setDoor(int door) {
		this.door = door;
	}

}
