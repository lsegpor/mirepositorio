package colecciones1;

import java.util.Collections;
import java.util.LinkedList;

public class Ej3 {
	
	public static void main(String[] args) {
		LinkedList<Integer> listaEnteros = new LinkedList<>();

		for (int i = 0; i < 20; i++) {
			int num = (int) (Math.random() * 11);
			int index = Collections.binarySearch(listaEnteros, num, Collections.reverseOrder());
			if (index < 0) {
				index = -index - 1;
			}
			listaEnteros.add(index, num);
		}
		
		System.out.println(listaEnteros);
	}
}
