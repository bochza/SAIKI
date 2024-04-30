package psyche;

import java.util.List;

public class UsuariosM extends Usuarios {

	protected List<Medidas> medidas;

	public UsuariosM(List<Medidas> med, String nombre) {
		super(nombre);
		this.medidas = med;
	}

	public UsuariosM() {

	}

	public List<Medidas> getMedidas() {
		return medidas;
	}

	public void setMedidas(List<Medidas> medidas) {
		this.medidas = medidas;
	}

}
