package aparcamientos;

import java.util.List;

public class Empresa {

    private String nombre;
    private List<Aparcamiento> aparcamientos;

    public Empresa(String nombre) {
    }

    public void registrarAparcamiento(Aparcamiento a) {
    }

    public List<Aparcamiento> buscarPorCiudad(String ciudad) {
		return aparcamientos;
    }

    public List<Aparcamiento> consultarTodos() {
		return aparcamientos;
    }
}