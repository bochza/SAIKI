
package psyche;
import java.util.List;

public class Medidas {
	protected List<Integer> medidas;

	public Medidas(List<Integer> med) {

		this.medidas = med;

	}

	// recibo medida en un int --> dato
	// dato.add=? ----> List<Medidas>
	// usuariosM usa las medidas

	public Medidas() {


	}

	public List<Integer> getMedidas() {
		return medidas;
	}

	public void setMedidas(List<Integer> medidas) {
		this.medidas = medidas;
	}

}
