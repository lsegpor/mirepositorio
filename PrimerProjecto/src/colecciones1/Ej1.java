package colecciones1;

import java.util.ArrayList;
import java.util.Collections;

public class Ej1 {

	public static void main(String[] args) {
		ArrayList<Integer> listaEnteros = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			listaEnteros.add((int) (Math.random() * 101));
		}
		System.out.println(listaEnteros);
		Collections.sort(listaEnteros);
		System.out.println(listaEnteros);
	}
}
