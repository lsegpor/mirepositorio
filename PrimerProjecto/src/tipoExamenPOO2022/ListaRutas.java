package tipoExamenPOO2022;

import java.util.Arrays;

public class ListaRutas {
	private Ruta[] rutas;
	private int numRutas = 0;

	public ListaRutas(Ruta[] rutas) {
		super();
		setRutas(rutas);
	}

	public ListaRutas() {
		super();
		rutas = new Ruta[10];
	}

	public Ruta[] getRutas() {
		return rutas;
	}

	public int getNumRutas() {
		return numRutas;
	}

	public void setRutas(Ruta[] rutas) {
		this.rutas = rutas;
		numRutas = 0;
		for (int i = 0; i < rutas.length && rutas[i] != null; i++) {
			numRutas++;
		}
	}

	public void addRuta(Ruta r) {
		if (this.rutas.length >= this.numRutas) {
			this.rutas = Arrays.copyOf(rutas, this.rutas.length + 1);
		}
		this.rutas[numRutas++] = r;
	}
	
	public static boolean containsCiudad(Ciudad[] array, Ciudad ciudad) {
		boolean esta = false;
		for (int i=0; i<array.length && array[i]!=null && !esta; i++) {
			if (array[i].equals(ciudad)) {
				esta = true;
			}
		}
		return esta;
	}

	// a
	public boolean hayRutaEntre(Ciudad origen, Ciudad destino) {
		boolean hay = false;
		for (int i=0; i<this.numRutas && !hay; i++) {
			if (this.rutas[i].getOrigen().equals(origen) && this.rutas[i].getDestino().equals(destino)) {
				hay = true;
			}
		}
		return hay;
	}

	// b
	public boolean hayRutaDeIdaYVueltaEntre(Ciudad origen, Ciudad destino) {
		return hayRutaEntre(origen, destino) && hayRutaEntre(destino, origen);
	}

	// c
	public ListaRutas getRutasDesde(Ciudad origen) {
		ListaRutas listaRutas = new ListaRutas();
		for (int i=0; i<this.numRutas; i++) {
			if (this.rutas[i].getOrigen().equals(origen)) {
				listaRutas.addRuta(this.rutas[i]);
			}
		}
		return listaRutas;
	}

	// d
	public Ciudad[] getCiudadesImportantes(int numHabitantes) {
		Ciudad[] ciudadesMasHabitantes = new Ciudad[10];
		int numCiudades = 0;
		for (int i=0; i<this.numRutas; i++) {
			if (this.rutas[i].getOrigen().getNumHabitantes() >= numHabitantes) {
				if (!containsCiudad(ciudadesMasHabitantes, this.rutas[i].getOrigen())) {
					if (ciudadesMasHabitantes.length >= numCiudades) {
						ciudadesMasHabitantes[numCiudades++] = this.rutas[i].getDestino();
					}
				}
			}
		}
		return Arrays.copyOf(ciudadesMasHabitantes, numCiudades);
	}

	// e)
	public ListaRutas getListaOrdenada() {
		ListaRutas lOrdenada = new ListaRutas();
		lOrdenada.setRutas(Arrays.copyOf(this.rutas, numRutas));
		Arrays.sort(lOrdenada.rutas);
		return lOrdenada;
	}

	@Override
	public String toString() {
		return "ListaRutas [rutas=" + Arrays.toString(Arrays.copyOf(rutas, numRutas)) + "]";
	}

}