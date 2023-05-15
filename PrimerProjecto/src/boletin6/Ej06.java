package boletin6;
import java.util.Scanner;
import java.util.Arrays;

/*Implementar una función sinRepetidos() con el prototipo:
int[] sinRepetidos(int t[])
que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se
han eliminado los datos repetidos.*/

public class Ej06 {
	
	public static int[] sinRepetidos(int t[]) {
		int numElem=t.length;
		for (int j=0; j<numElem; j++) {
			for (int k=j+1; k<numElem; k++) {
				if (t[j]==t[k]) {
					for (int f=k+1; f<numElem; f++) {
						t[f-1]=t[f];
					}
					numElem--;
					t[numElem]=0;
				}
			}
		}
		
		return t;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Introduce la extension de la tabla.");
			int num=sc.nextInt();
			int tabla[]=new int [num];
			System.out.println("Introduce los valores de la tabla.");
			for (int i=0; i<tabla.length; i++) {
				tabla[i]=sc.nextInt();
			}
			int numTabla=0;
			sinRepetidos(tabla);
			for (int celda:tabla) {
				if (celda!=0) {
					numTabla++;
				}
			}
			int tablaFinal[]=Arrays.copyOf(tabla, numTabla);
			System.out.println(Arrays.toString(tablaFinal));
		}
	}
}