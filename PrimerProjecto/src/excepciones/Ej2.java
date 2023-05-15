package excepciones;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre.");
		String nombre = sc.next();
		
		System.out.println("Introduce tu edad.");
		int edad = sc.nextInt();
		
		new File("datos.txt");
		try (BufferedWriter in = new BufferedWriter(new FileWriter("datos.txt", false))) {
			in.write(nombre + ", " + edad);
			System.out.println("Datos almacenados correctamente en datos.txt");
		} catch (IOException e) {
			System.out.println("Error al crear el archivo");
		}
		
		sc.close();
	}
}