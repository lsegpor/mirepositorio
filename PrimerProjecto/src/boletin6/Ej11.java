package boletin6;
import java.util.Scanner;
import java.util.Arrays;

/*Diseñar una aplicación para gestionar un campeonato de
programación, donde se introducen las puntuaciones (enteros) obtenidas por 5
programadores, conforme van terminando su prueba. La aplicación debe mostrar
las puntuaciones ordenadas de los 5 participantes. En ocasiones, cuando finalizan
los 5 participantes anteriores, se suman al campeonato un máximo de 3
programadores de exhibición, cuyos puntos se incluyen con el resto (en la posición
adecuada para que sigan ordenadas). La forma de especificar que no intervienen
más programadores de exhibición es introducir como puntuación un -1. La
aplicación debe mostrar, finalmente, los puntos ordenados de todos los
participantes.*/

public class Ej11 {
	
	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int num, cont=1, totalPuntos=4, k;
			int puntos[]=new int [5];
			System.out.println("Introduce las puntuaciones de los 5 programadores participantes.");
			for (int i=0; i<5; i++) {
				puntos[i]=sc.nextInt();
			}
			Arrays.sort(puntos);
			System.out.println(Arrays.toString(puntos));
			int puntosTotal[]=Arrays.copyOf(puntos, 8);
			System.out.println("Introduce ahora las puntuaciones de los programadores de exhibicion.");
			num=sc.nextInt();
			while (num!=-1 && cont<=3) {
				for (int j=0; j<puntosTotal.length; j++) {
					if (j==0 && num<=puntosTotal[j]) {
						for (k=totalPuntos; k>=j; k--) {
							puntosTotal[k+1]=puntosTotal[k];
						}
						k=k+1;
						puntosTotal[k]=num;
						totalPuntos++;
					} else if (j!=puntosTotal.length-1 && num>puntosTotal[j] && num<=puntosTotal[j+1]) {
						for (k=totalPuntos; k>j; k--) {
							puntosTotal[k+1]=puntosTotal[k];
						}
						k=k+1;
						puntosTotal[k]=num;
						totalPuntos++;
					} else if (j==totalPuntos && num>puntosTotal[j]) {
						puntosTotal[j+1]=num;
						totalPuntos++;
					}
				}
				num=sc.nextInt();
				cont++;
			}
			cont=cont-1;
			int puntosTotalFinal[]=Arrays.copyOf(puntosTotal, puntos.length+cont);
			System.out.println(Arrays.toString(puntosTotalFinal));
		}
	}
}