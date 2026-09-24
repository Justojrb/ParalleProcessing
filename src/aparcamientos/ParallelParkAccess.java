package aparcamientos;

public class ParallelParkAccess {

	public static void main(String[] args) {

		Aparcamiento parking1 = new Aparcamiento("madrid", "Aparcamiento 1", 100);
		Aparcamiento parking2 = new Aparcamiento("barcelona", "Aparcamiento 2", 200);
		Empresa empresaValen = new Empresa("Valen");
		empresaValen.registrarAparcamiento(parking1);
		empresaValen.registrarAparcamiento(parking2);

		int numOfThreads = 40;
		Thread[] threads = new Thread[numOfThreads];
		for (int i = 0; i < numOfThreads; i++) {
			Thread t = new EntranceJob(parking1, "Justo" + i);
			threads[i] = t;
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		Thread t1 = new EntranceJob(parking1, "Justo");
		Thread t2 = new EntranceJob(parking1, "Camicha");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(parking1.getCochesAparcados());

	}

}