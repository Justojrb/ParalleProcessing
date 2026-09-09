package aparcamientos;

public class Aparcamiento {

    private String ciudad;
    private String nombre;
    private int capacidadMaxima;
    private int cochesAparcados;

    public Aparcamiento(String ciudad, String nombre, int capacidadMaxima) {
    }

    public synchronized void entrarCoche() {
    }

    public synchronized void salirCoche() {
    }

    public synchronized int getCochesAparcados() {
		return capacidadMaxima;
    }

    public String getCiudad() {
		return ciudad;
    }
}