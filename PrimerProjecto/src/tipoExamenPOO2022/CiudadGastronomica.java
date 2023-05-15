package tipoExamenPOO2022;

import java.util.Arrays;

public class CiudadGastronomica extends Ciudad {
	private String[] comidasTipicas = new String[10];
	private int numComidas = 0;

	public CiudadGastronomica(String nombre, int numHabitantes) {
		super(nombre, numHabitantes);
	}
	
	public CiudadGastronomica(String nombre, int numHabitantes, String[] comidasTipicas) {
		super(nombre, numHabitantes);
		setComidasTipicas(comidasTipicas);
	}

	public String[] getComidasTipicas() {
		return comidasTipicas;
	}

	public void setComidasTipicas(String[] comidasTipicas) {
		for (int i=0; i<comidasTipicas.length && comidasTipicas[i]!=null; i++) {
			this.numComidas++;
		}
		this.comidasTipicas = comidasTipicas;
	}
	
	public void addComida(String comida) {
		if (this.numComidas >= this.comidasTipicas.length) {
			this.comidasTipicas = Arrays.copyOf(comidasTipicas, numComidas+1);
		}
		this.comidasTipicas[numComidas++] = comida;
	}

	@Override
	public String toString() {
		return super.toString() + "comidasTipicas=" + Arrays.toString(comidasTipicas);
	}
	
	
}
