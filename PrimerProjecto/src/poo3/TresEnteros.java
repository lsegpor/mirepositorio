package poo3;

import java.util.Arrays;

public class TresEnteros implements Estadisticas<Integer> {
	private Integer num1;
	private Integer num2;
	private Integer num3;

	public TresEnteros(Integer num1, Integer num2, Integer num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}

	@Override
	public Integer mayor() {
		return Math.max(Math.max(num1, num2), num3);
	}

	@Override
	public Integer menor() {
		return Math.min(Math.min(num1, num2), num3);
	}

	@Override
	public double media() {
		return (num1 + num2 + num3) / 3.0;
	}

	@Override
	public Integer[] mayoresQue(Integer obj) {

		Integer[] misNumeros = { num1, num2, num3 };
		Integer[] numerosMayores = new Integer[3];

		for (int i = 0; i < misNumeros.length; i++) {
			for (int j = 0; j < numerosMayores.length; j++) {
				if (misNumeros[i] > obj) {
					int tamano = 0;
					numerosMayores[tamano] += misNumeros[i];
					tamano++;

					Arrays.copyOf(numerosMayores, tamano);

				}
			}

		}

		return numerosMayores;
	}

	@Override
	public Integer[] menoresQue(Integer obj) {

		Integer[] misNumeros = { num1, num2, num3 };
		Integer[] numerosMenores = new Integer[3];

		for (int i = 0; i < misNumeros.length; i++) {
			for (int j = 0; j < numerosMenores.length; j++) {
				if (misNumeros[i] < obj) {
					int tamano = 0;
					numerosMenores[tamano] += misNumeros[i];
					tamano++;

					Arrays.copyOf(numerosMenores, tamano);

				}
			}

		}
		return numerosMenores;
	}
}
