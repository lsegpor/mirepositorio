package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce el nombre del archivo: ");
		String nombreArchivo = scanner.nextLine();

		File archivo = new File(nombreArchivo);

		if (!archivo.exists()) {
			nombreArchivo = "prueba.txt";
			archivo = new File(nombreArchivo);
		}

		try {
			FileReader fileReader = new FileReader(archivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String linea;
			while ((linea = bufferedReader.readLine()) != null) {
				System.out.println(linea);
			}

			bufferedReader.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			System.out.println("Error al leer el archivo");
		}

		scanner.close();
	}
}