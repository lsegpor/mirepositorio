package boletin6;
import java.util.Scanner;

/*Escribir un programa que solicite los elementos de una matriz de
tamaño 4x4. La aplicación debe decidir si la matriz es una matriz mágica. Una matriz
es mágica si la suma de los elementos de cualquier fila o de cualquier columna, vale
lo mismo.*/

public class Ej12 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			boolean matrizMagica=true;
			int sumaMatrizFilaOcolumna=0, sumaMagica=0;
			int matriz[][]=new int [4][4];
			System.out.println("Introduce los valores de la matriz.");
			for (int i=0; i<4; i++) {
				for (int j=0; j<4; j++) {
					matriz[i][j]=sc.nextInt();
				}
			}
			for (int f=0; f<4; f++) {
				sumaMagica=sumaMagica+matriz[0][f];
			}
			for (int v=0; v<4 && matrizMagica==true; v++) {
				for (int h=0; h<4; h++) {
					sumaMatrizFilaOcolumna=sumaMatrizFilaOcolumna+matriz[v][h];
				}
				if (sumaMatrizFilaOcolumna!=sumaMagica) {
					matrizMagica=false;
				}
				sumaMatrizFilaOcolumna=0;
			}
			for (int h=0; h<4 && matrizMagica==true; h++) {
				for (int v=0; v<4; v++) {
					sumaMatrizFilaOcolumna=sumaMatrizFilaOcolumna+matriz[v][h];
				}
				if (sumaMatrizFilaOcolumna!=sumaMagica) {
					matrizMagica=false;
				}
				sumaMatrizFilaOcolumna=0;
			}
			if (matrizMagica==true) {
				System.out.println("La matriz introducida es magica.");
			} else {
				System.out.println("La matriz introducida no es magica");
			}
		}
	}
}