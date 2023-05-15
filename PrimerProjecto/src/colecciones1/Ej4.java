package colecciones1;

import java.util.HashSet;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce una frase separada por espacios.");
			String frase = sc.nextLine();
			
			String[] palabras = frase.split(" ");
			
			HashSet<String> palabrasRep = new HashSet<>();
			HashSet<String> palabrasNoRep = new HashSet<>();
			
			for (int i = 0; i < palabras.length; i++) {
				String palabra = palabras[i];
				if (palabrasNoRep.contains(palabra)) {
					palabrasRep.add(palabra);
				} else {
					palabrasNoRep.add(palabra);
				}
					
			}
			
			palabrasNoRep.removeAll(palabrasRep);
			
			System.out.println("Palabras repetidas: " + palabrasRep);
			System.out.println("Palabras no repetidas: " + palabrasNoRep);
		}
	}
}
