package excepcionesTipoExamen1819;

import java.io.Serializable;
import java.util.LinkedHashMap;

public class Estadisticas implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LinkedHashMap<String, Integer> tresPalabras;
	private int numPalabrasDistintas;

	public Estadisticas() {
		this.tresPalabras = new LinkedHashMap<String, Integer>();
		this.numPalabrasDistintas = 0;
	}

	public LinkedHashMap<String, Integer> getTresPalabras() {
		return tresPalabras;
	}

	public void setTresPalabras(LinkedHashMap<String, Integer> tresPalabras) {
		this.tresPalabras = tresPalabras;
	}

	public int getNumPalabrasDistintas() {
		return numPalabrasDistintas;
	}

	public void setNumPalabrasDistintas(int numPalabrasDistintas) {
		this.numPalabrasDistintas = numPalabrasDistintas;
	}

}
