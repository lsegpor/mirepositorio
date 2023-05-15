package colecciones1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<String> nombres = new LinkedList<>();
			String nombre = sc.next();
			while (!nombre.equals("Fin")) {
				nombres.add(nombre);
				nombre = sc.next();
			}
			System.out.println(eliminaRepetidos(nombres));
		}
	}
	public static List<String> eliminaRepetidos(List<String> c) {
		HashSet<String> nombresSinRep = new HashSet<>(c);
		List<String> nombresSinRepList = new ArrayList<>(nombresSinRep);
		return nombresSinRepList;
	}
}