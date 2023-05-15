package colecciones1;

import java.util.Scanner;
import java.util.TreeSet;

public class Ej7 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			TreeSet<String> palabras = new TreeSet<>();
			String palabra = sc.next();
			while (!palabra.equals("Fin")) {
				palabras.add(palabra);
				palabra = sc.next();
			}
			System.out.println(palabras);
		}
	}
}