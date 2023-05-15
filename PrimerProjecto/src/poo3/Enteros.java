package poo3;

import java.util.Arrays;

public class Enteros implements Estadisticas<Integer> {

	private Integer[] numeros;

	public Enteros(Integer[] numeros) {
		super();
		this.numeros = numeros;
	}

	@Override
	public Integer mayor() {

		Integer numMayor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > numMayor) {
				numMayor = numeros[i];
			}
		}
		return numMayor;
	}

	@Override
	public Integer menor() {
		Integer menor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		return menor;
	}

	@Override
	public double media() {
		double suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		return suma / numeros.length;
	}

	@Override
	public Integer[] mayoresQue(Integer obj) {
		int contador = 0;
		Integer[] mayores = new Integer[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > obj) {
				mayores[contador++] = numeros[i];

			}

		}
		return Arrays.copyOf(mayores, contador);

	}

	@Override
	public Integer[] menoresQue(Integer obj) {
		int contador = 0;
		Integer[] menores = new Integer[numeros.length];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < obj) {
				menores[contador++] = numeros[i];

			}

		}
		return Arrays.copyOf(menores, contador);

	}

}