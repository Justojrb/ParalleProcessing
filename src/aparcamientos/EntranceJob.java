package aparcamientos;

public class EntranceJob extends Thread {
	
	private Aparcamiento parking;

	public EntranceJob(Aparcamiento aparcamiento1) {
	}
	@Override
	
	public void run() {
		System.out.println(parking);
	}
	
	

}
