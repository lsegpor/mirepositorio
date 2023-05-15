package control2;
import java.util.Scanner;

public class Examen {
	
	private static int indice(String[] tabla, int num, String aBuscar) {
		int index=-1;
		for (int i=0; i<num && index==-1; i++) {
			if (tabla[i].equals(aBuscar)) {
				index=i;
			}
		}
		return index;
	}
	
	private static int[] ordenar(int[] tablaDesordenada, String[] ciudadesDesordenadas, String[] ciudadesOrdenadas) {
		int[] tablaOrdenada=new int[tablaDesordenada.length];
		for (int i=0; i<tablaDesordenada.length; i++) {
			int j=i-1;
			while (j>=0 && tablaOrdenada[j]>tablaDesordenada[i]) {
				tablaOrdenada[j+1]=tablaOrdenada[j];
				ciudadesOrdenadas[j+1]=ciudadesOrdenadas[j];
				j--;
			}
			tablaOrdenada[j+1]=tablaDesordenada[i];
			ciudadesOrdenadas[j+1]=ciudadesDesordenadas[i];
		}
		return tablaOrdenada;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int viajeros[][]=new int[20][20];
			String ciudades[]=new String[20];
			int opcion, numCiudades=0;
			System.out.println("1- Introducir numero de viajeros que volaron desde un origen a un destino.");
			System.out.println("2- Listado por ciudades de todos los datos introducidos.");
			System.out.println("3- Cuenta el numero de errores.");
			System.out.println("4- Media de viajeros por origen/destino.");
			System.out.println("5- Listado de ciudades origen ordenadas por numero de viajeros.");
			System.out.println("6- Indica si existen viajes hacia el mismo destino con el mismo numero de viajeros.");
			System.out.println("7- Fin.");
			opcion=sc.nextInt();
			
			while (opcion!=7) {
				switch (opcion) {
				case 1:
					System.out.println("Introduce el pais de origen.");
					String origen=sc.next();
					int filaOrigen=indice(ciudades, numCiudades, origen);
					if (filaOrigen==-1) {
						ciudades[numCiudades]=origen;
						filaOrigen=numCiudades;
						numCiudades++;
					}
					System.out.println("Introduce el pais de destino.");
					String destino=sc.next();
					int columnaDestino=indice(ciudades, numCiudades, destino);
					if (columnaDestino==-1) {
						ciudades[numCiudades]=destino;
						columnaDestino=numCiudades;
						numCiudades++;
					}
					System.out.println("Introduce el numero de viajeros.");
					viajeros[filaOrigen][columnaDestino]+=sc.nextInt();
					System.out.println("Datos almacenados.");
					System.out.println("");
					break;
					
				case 2:
					for (int i=0; i<numCiudades; i++) {
						System.out.println("Ciudad: "+ciudades[i]+".");
						for (int j=0; j<numCiudades; j++) {
							if (viajeros[i][j]>0) {
								System.out.println("Viaje "+ciudades[i]+" --> "+ciudades[j]+": "+viajeros[i][j]+" viajeros.");
							}
						}
						for (int j=0; j<numCiudades; j++) {
							if (viajeros[j][i]>0) {
								System.out.println("Viaje "+ciudades[j]+" --> "+ciudades[i]+": "+viajeros[j][i]+" viajeros.");
							}
						}
					}
					System.out.println("");
					break;
					
				case 3:
					int errores=0;
					for (int i=0; i<numCiudades; i++) {
						if (viajeros[i][i]>0) {
							errores++;
						}
					}
					System.out.println("El numero de ciudades con error es: "+errores+".");
					System.out.println("");
					break;
					
				case 4:
					int numViajes=0, numViajeros=0;
					float mediaViajeros;
					for (int i=0; i<numCiudades; i++) {
						for (int j=0; j<numCiudades; j++) {
							if (viajeros[i][j]>0) {
								numViajes++;
								numViajeros+=viajeros[i][j];
							}
						}
					}
					mediaViajeros=(float)numViajeros/numViajes;
					System.out.println("La media de viajeros en cada origen/destino es: "+mediaViajeros+".");
					System.out.println("");
					break;
					
				case 5:
					int[] totalViajerosOrigen=new int[20];
					for (int i=0; i<numCiudades; i++) {
						for (int j=0; j<numCiudades; j++) {
							if (viajeros[i][j]>0) {
								totalViajerosOrigen[i]+=viajeros[i][j];
							}
						}
					}
					String[] nombresCiudades=new String[20];
					int[] totalViajerosOrdenados=ordenar(totalViajerosOrigen, ciudades, nombresCiudades);
					for (int i=0; i<20; i++) {
						if (totalViajerosOrdenados[i]>0) {
							System.out.println("La ciudad: "+nombresCiudades[i]+" es origen de vuelos con un total de: "+totalViajerosOrdenados[i]+" pasajeros.");
						}
					}
					System.out.println("");
					break;
					
				case 6:
					boolean igual=false;
					for (int j=0; j<numCiudades && igual==false; j++) {
						for (int i=0; i<numCiudades && igual==false; i++) {
							if (viajeros[i][j]>0) {
								for (int k=i+1; k<numCiudades && igual==false; k++) {
									if (viajeros[k][j]==viajeros[i][j]) {
										igual=true;
									}
								}
							}
						}
					}
					System.out.println("Existen viajes hacia el mismo destino con el mismo numero de viajeros: "+igual+".");
					System.out.println("");
					break;
					
				default:
					System.out.println("Numero de opcion invalido. Vuelva a intentarlo.");
					System.out.println("");
					break;
				}
				System.out.println("1- Introducir numero de viajeros que volaron desde un origen a un destino.");
				System.out.println("2- Listado por ciudades de todos los datos introducidos.");
				System.out.println("3- Cuenta el numero de errores.");
				System.out.println("4- Media de viajeros por origen/destino.");
				System.out.println("5- Listado de ciudades origen ordenadas por numero de viajeros.");
				System.out.println("6- Indica si existen viajes hacia el mismo destino con el mismo numero de viajeros.");
				System.out.println("7- Fin.");
				opcion=sc.nextInt();
			}
		}
	}
}