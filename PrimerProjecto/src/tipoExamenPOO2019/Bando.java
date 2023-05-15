package tipoExamenPOO2019;

public class Bando {
	private String nombre; 						// nombre del bando
	private Pais tablaPaises[]; 				// paises que formaron este bando
	private int nPaises; 						// numero de paises en la tabla
	public static final int MAX_PAISES = 10; 	// maximo.

	public Pais[] getTablaPaises() {
		return tablaPaises;
	}
	
	public Bando(String nombre) {
		this.nombre = nombre;
		this.tablaPaises = new Pais[Bando.MAX_PAISES];
		this.nPaises = 0;
	}

	public void anyadePais(Pais pais) {
		this.tablaPaises[nPaises++] = pais;
	}

	public String toString() {
		String cad = nombre + "\n";
		for (int i = 0; i < this.nPaises; i++)
			cad += "                      - " + this.tablaPaises[i] + "\n";
		return cad;
	}
	public int getnPaises() {
		return nPaises;
	}
	
	public boolean contienePais(Pais p) {
		for (int i=0; i<this.nPaises; i++) {
			if (this.tablaPaises[i].equals(p)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(Bando otro) {
		for (int i=0; i<this.nPaises; i++) {
			if (!otro.contienePais(this.tablaPaises[i])) {
				return false;
			}
		}
		
		for (int i=0; i<otro.nPaises; i++) {
			if (!this.contienePais(otro.tablaPaises[i])) {
				return false;
			}
		}
		return true;
	}
}