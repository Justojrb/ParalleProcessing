package aparcamientos;

public class EntranceJob extends Thread {
	
	private Aparcamiento parking;

	public EntranceJob(Aparcamiento aparcamiento1, String string) {
		parking = aparcamiento1;
		
	
	}
	@Override
	
	public void run() {
		System.out.println("Start the job with the thread" + Thread.currentThread().getName());
		System.out.println(parking + "Object address from thread" + Thread.currentThread());
		System.out.println("End the job with the thread" + Thread.currentThread().getName());
		parking.entrarCoche();


	}
	
	

}
