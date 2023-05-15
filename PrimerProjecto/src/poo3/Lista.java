package poo3;

import java.util.Arrays;

public class Lista {
	private Integer[] miArray;
	private int numElem = 0;

	public Lista() {
		miArray = new Integer[10];
	}

	public Lista(int tam) {
		miArray = new Integer[tam];
	}

	public int getNumElem() {
		return numElem;
	}

	public void add(Integer elem) {
		redimensionoArraySiNecesario();
		miArray[numElem++] = elem;
	}

	public void addPrincipio(Integer elem) {
		redimensionoArraySiNecesario();
		// mover elementos
		for (int i = numElem; i > 0; i--) {
			miArray[i] = miArray[i - 1];
		}
		// inserto en posici�n inicial
		miArray[0] = elem;
		numElem++;
	}

	// Insertar un n�mero en un lugar de la lista cuyo �ndice se pasa como
	// par�metro.
	public boolean add(Integer elem, int posicion) {
		boolean anyadido = false;
		if (posicion >= 0 && posicion <= numElem) {
			// posici�n v�lida. A�adiremos elemento
			redimensionoArraySiNecesario();
			// mover elementos
			for (int i = numElem; i > posicion; i--) {
				miArray[i] = miArray[i - 1];
			}
			anyadido = true;
		}

		miArray[posicion] = elem;
		numElem++;
		return anyadido;
	}

	public void add(Lista lista2) {
		for (int i = 0; i < lista2.numElem; i++) {
			this.add(lista2.get(i));
		}
	}

	public Integer get(int pos) {
		Integer elem = null;
		if (pos >= 0 && pos < numElem) {
			elem = miArray[pos];
		}
		return elem;
	}

	public boolean remove(int pos) {
		boolean borrado = false;
		if (pos >= 0 && pos < numElem) {
			for (int i = pos; i < numElem - 1; i++) {
				this.miArray[i] = this.miArray[i + 1];
			}
			numElem--;
			borrado = true;
		}
		return borrado;
	}

	public int getIndexOf(Integer elem) {
		int indice = -1;
		for (int i = 0; i < numElem && indice == -1; i++) {
			if (miArray[i].equals(elem)) {
				indice = i;
			}
		}
		return indice;
	}

	private boolean redimensionoArraySiNecesario() {
		boolean aumentado = false;
		if (miArray.length >= numElem) {
			miArray = Arrays.copyOf(miArray, numElem + 10);
			aumentado = true;
		}
		return aumentado;
	}

	@Override
	public String toString() {
		String cadena = "[";
		for (int i = 0; i < numElem; i++) {
			cadena += this.miArray[i];
			if (i + 1 < numElem) {
				cadena += ", ";
			}
		}
		cadena += "]";
		return cadena;
	}

}
