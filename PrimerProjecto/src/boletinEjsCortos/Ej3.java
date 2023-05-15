package boletinEjsCortos;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int mes, dia, piezas, diaPiezasMax, piezasMax, piezasMin, total, debajoMin;
			diaPiezasMax=0;
			piezasMax=0;
			piezasMin=1000;
			debajoMin=0;
			total=0;
			System.out.println("Introduce el numero del mes del que vas a guardar datos.");
			mes=sc.nextInt();
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12:
				for (dia=1; dia<=31; dia++) {
					System.out.println("Introduce el numero de piezas que se han fabricado en el dia "+dia+".");
					piezas=sc.nextInt();
					if (piezas>1000) {
						System.out.println("No pueden hacerse mas de 1000 piezas en un dia.");
					} else {
						total=total+piezas;
						if (piezas>piezasMax) {
							piezasMax=piezas;
							diaPiezasMax=dia;
						} else if (piezas<piezasMin) {
							piezasMin=piezas;
						} else if (piezas<300) {
							debajoMin++;
						}
					}
				}
				break;
			case 4, 6, 9, 11:
				for (dia=1; dia<=30; dia++) {
					System.out.println("Introduce el numero de piezas que se han fabricado en el dia "+dia+".");
					piezas=sc.nextInt();
					if (piezas>1000) {
						System.out.println("No pueden hacerse mas de 1000 piezas en un dia.");
					} else {
						total=total+piezas;
						if (piezas>piezasMax) {
							piezasMax=piezas;
							diaPiezasMax=dia;
						} else if (piezas<piezasMin) {
							piezasMin=piezas;
						} else if (piezas<300) {
							debajoMin++;
						}
					}
				}
				break;
			case 2:
				for (dia=1; dia<=28; dia++) {
					System.out.println("Introduce el numero de piezas que se han fabricado en el dia "+dia+".");
					piezas=sc.nextInt();
					if (piezas>1000) {
						System.out.println("No pueden hacerse mas de 1000 piezas en un dia.");
					} else {
						total=total+piezas;
						if (piezas>piezasMax) {
							piezasMax=piezas;
							diaPiezasMax=dia;
						} else if (piezas<piezasMin) {
							piezasMin=piezas;
						} else if (piezas<300) {
							debajoMin++;
						}
					}
				}
				break;
			default:
				System.out.println("El numero introducido no pertenece a ningun mes del año.");
				break;
			}
			System.out.println("El dia que mas piezas se han fabricado ha sido el "+diaPiezasMax+".");
			System.out.println("El minimo de piezas fabricadas ha sido de "+piezasMin+" piezas.");
			System.out.println("Durante ese mes se han fabricado un total de "+total+" piezas.");
			if (debajoMin>0) {
				System.out.println("Existen dias por debajo del minimo de produccion.");
			}
		}
	}
}
