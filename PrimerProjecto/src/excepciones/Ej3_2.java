package excepciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej3_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el nombre del archivo: ");
		String nombreArchivo = scanner.nextLine();
		try (BufferedReader in = new BufferedReader(new FileReader(nombreArchivo))) {
			BufferedWriter br = new BufferedWriter(new FileWriter("copia_de"+ nombreArchivo +".txt", false));
			String linea;
			while ((linea = in.readLine()) != null) {
				br.write(linea);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}
	
	
}
