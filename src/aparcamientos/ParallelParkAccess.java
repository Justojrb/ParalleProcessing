package aparcamientos;

public class ParallelParkAccess {
	public static void main(String[] args) {
		
		Aparcamiento aparcamiento1 = new Aparcamiento ("Madrid", "Park1", 1000);
		Aparcamiento aparcamiento2 = new Aparcamiento ("Sevilla", "Park2", 2000);
		Empresa empresa = new Empresa("paralel");
		empresa.registrarAparcamiento(aparcamiento1);
		empresa.registrarAparcamiento(aparcamiento2);
		
		Thread t1 = new EntranceJob(aparcamiento1);
		Thread t2 = new EntranceJob(aparcamiento2);
		
		t1.start();
		t2.start();

		



	}     

}
