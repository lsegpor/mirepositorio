package excepciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ej3 {

	public static void main(String[] args) {
		try (BufferedReader in = new BufferedReader(new FileReader("original.txt"))) {
			BufferedWriter br = new BufferedWriter(new FileWriter("copia.txt", false));
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