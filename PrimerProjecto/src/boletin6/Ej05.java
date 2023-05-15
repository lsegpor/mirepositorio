package boletin6;
import java.util.Scanner;
import java.util.Arrays;

/*Leer una serie de 6 enteros que se almacenarán en una tabla que hay que
ordenar y mostrar. Hacer lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos
tablas en una tercera, de forma que los 12 números sigan ordenados. Fusionar significa copiar
en el orden correcto para que los datos resultantes continúen ordenados sin necesidad de
volver a realizar una ordenación.*/

public class Ej05 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int tabla1[]=new int [6];
			int tabla2[]=new int [6];
			int tabla3[]=new int [12];
			int num1=0, num2=0;
			for (int i=0; i<tabla1.length; i++) {
				System.out.println("Introduce un numero.");
				tabla1[i]=sc.nextInt();
			}
			Arrays.sort(tabla1);
			System.out.println("La primera tabla ordenada es "+Arrays.toString(tabla1));
			for (int j=0; j<tabla2.length; j++) {
				System.out.println("Introduce otro numero.");
				tabla2[j]=sc.nextInt();
			}
			Arrays.sort(tabla2);
			System.out.println("La segunda tabla ordenada es "+Arrays.toString(tabla2));
			for(int k=0; k<tabla3.length; k++) {
				if(num1<tabla1.length && num2<tabla2.length && tabla1[num1]<=tabla2[num2]) {
					tabla3[k]=tabla1[num1];
					num1++;
				}else if(num1<tabla1.length && num2<tabla2.length){
					tabla3[k]=tabla2[num2];
					num2++;
				}else if(num1<tabla1.length){
					tabla3[k]=tabla1[num1];
					num1++;
				}else{
					tabla3[k]=tabla2[num2];
					num2++;
				}
			}
			System.out.println("Las dos tablas fusionadas son "+Arrays.toString(tabla3));
		}
	}
}