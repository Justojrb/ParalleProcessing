package aparcamientos;

public class Aparcamiento {

	private String name;

	private int capacity;

	private int cars;

	public int getCapacity() {
		return capacity;
	}

	public int getCars() {
		return cars;
	}

	public void setCars(int cars) {
		this.cars = cars;
	}

	public void parking(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.cars = cars;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void increment() {
		cars++;
	}
	
	public void decrease() {
		cars--;
	}
	

}

