package boletinEjsCortos;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char tipoArbol;
			float diametro, diametroMax, diametroMin, altura, alturaMax, alturaMin, edad, num, numB, mediaAltura, numMediaAltura, mediaEdad, numMediaEdad, arbolMas30, i;
			diametroMax=0;
			diametroMin=100000;
			alturaMax=0;
			alturaMin=100000;
			arbolMas30=0;
			numMediaEdad=0;
			numMediaAltura=0;
			numB=0;
			System.out.println("Introduce el numero de arboles de los que vamos a guardar informacion.");
			num=sc.nextInt();
			for (i=1; i<=num; i++) {
				System.out.println("Di si el arbol numero "+i+" es de tipo A o B.");
				tipoArbol=sc.next().charAt(0);
				System.out.println("Introduce el diametro del tronco del arbol.");
				diametro=sc.nextInt();
				System.out.println("Introduce la altura del arbol.");
				altura=sc.nextInt();
				if (tipoArbol=='B') {
					System.out.println("Introduce la edad del arbol.");
					edad=sc.nextInt();
					numMediaEdad=numMediaEdad+edad;
					numB++;
				}
				numMediaAltura=numMediaAltura+altura;
				if (altura>alturaMax) {
					alturaMax=altura;
				}
				if (altura<alturaMin) {
					alturaMin=altura;
				}
				if (diametro>diametroMax) {
					diametroMax=diametro;
				}
				if (diametro<diametroMin) {
					diametroMin=diametro;
				}
				if (altura>=30) {
					arbolMas30++;
				}
			}
			mediaAltura=numMediaAltura/num;
			mediaEdad=numMediaEdad/numB;
			System.out.println("La media de las alturas de los arboles es de "+mediaAltura+" metros.");
			System.out.println("La altura maxima ha sido de "+alturaMax+" metros, y la minima de "+alturaMin+" metros.");
			System.out.println("El diametro maximo ha sido de "+diametroMax+" metros, y el minimo de "+diametroMin+" metros.");
			if (numB>0) {
				System.out.println("La media de las edades de los arboles de tipo B es de "+mediaEdad+" años.");
			}
			if (arbolMas30!=0) {
				System.out.println("Existen arboles de mas de 30 metros de altura.");
			}
		}
	}
}
