package colecciones1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Ej5 {

	public static void main(String[] args) {
		HashSet<Integer> listaEnteros = new HashSet<>();

		while (listaEnteros.size() < 20) {
			int num = (int) (Math.random() * 101);
			listaEnteros.add(num);
		}
		
		ArrayList<Integer> enterosLista = new ArrayList<>();
		enterosLista.addAll(listaEnteros);
		Collections.sort(enterosLista, Collections.reverseOrder());
		
		System.out.println(enterosLista);
	}
}