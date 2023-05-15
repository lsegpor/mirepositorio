package boletin6;
import java.util.Arrays;

/*Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la
siguiente forma: la posición [n,m] debe contener n+m. Después, se debe mostrar su
contenido.*/

public class Ej08 {

	public static void main(String[] args) {
		int tabla[][]=new int [5][5];
		for (int n=0; n<5; n++) {
			for (int m=0; m<5; m++) {
				tabla[n][m]=n+m;
			}
		}
		System.out.println(Arrays.deepToString(tabla));
	}
}