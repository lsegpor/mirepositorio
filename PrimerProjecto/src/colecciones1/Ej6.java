package colecciones1;

import java.util.HashSet;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashSet<String> palabras = new HashSet<>();
			String palabra = sc.next();
			while (!palabra.equals("Fin")) {
				palabras.add(palabra);
				palabra = sc.next();
			}
			System.out.println(palabras);
		}
	}
}