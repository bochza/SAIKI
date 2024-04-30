package psyche;


public class Usuarios {
	protected String nombre;

	public Usuarios(String nom) {
		this.nombre = nom;
	}

	public Usuarios() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
