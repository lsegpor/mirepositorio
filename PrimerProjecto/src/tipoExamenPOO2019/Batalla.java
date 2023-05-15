package tipoExamenPOO2019;

public class Batalla {
	private String nombre; 	// nombre de la batalla
	private Pais pais1; 	// uno de los paises contendientes en la batalla
	private Pais pais2; 	// el otro pais de la batalla.

	public Batalla(String nombre, Pais pais1, Pais pais2) {
		this.nombre = nombre;
		this.pais1 = pais1;
		this.pais2 = pais2;
	}
	
	public Pais getPais1() {
		return pais1;
	}
	
	public Pais getPais2() {
		return pais2;
	}

	public String toString() {
		return this.nombre + " (" + pais1 + " - " + pais2 + ")";
	}

}