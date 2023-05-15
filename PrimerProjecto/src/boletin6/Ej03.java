package boletin6;
import java.util.Scanner;

/*Introducir por teclado un número n; a continuación solicitar al usuario que
teclee n números. Realizar la media de los números positivos, la media de los negativos, y
contar el número de ceros introducidos.*/

public class Ej03 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Introduce un numero.");
			int num=sc.nextInt();
			int numeros[]=new int [num];
			
			int negativos=0, numNeg=0, positivos=0, numPos=0, ceros=0;
			float mediaPos, mediaNeg;
			
			for (int i=0; i<numeros.length; i++) {
				System.out.println("Introduce otro numero.");
				numeros[i]=sc.nextInt();
			}
			for (int tabla: numeros) {
				if (tabla<0) {
					numNeg++;
					negativos=negativos+tabla;
				} else if (tabla>0) {
					numPos++;
					positivos=positivos+tabla;
				} else {
					ceros++;
				}
			}
			mediaPos=(float)positivos/numPos;
			mediaNeg=(float)negativos/numNeg;
			System.out.println("La media de los numeros positivos es "+mediaPos+", la de los negativos "+mediaNeg+" y se han introducido "+ceros+" cero(s).");

		}
	}
}