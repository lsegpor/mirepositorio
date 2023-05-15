package ejsTipoExamenTablas;
import java.util.Scanner;
import java.util.Arrays;

public class Ej2013_2014_5 {
	
	private static int indice(String[] tabla, int num, String aBuscar) {
		int index=-1;
		for (int i=0; i<num && index==-1; i++) {
			if (tabla[i].equals(aBuscar)) {
				index=i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int numTabla=20;
			int combustible[][]=new int[numTabla][numTabla];
			String ciudades[]=new String[numTabla];
			int opcion, numCiudades=0;
			System.out.println("Bienvenido al menu de Ryanair. Indique una opcion.");
			System.out.println("");
			System.out.println("1- Introducir datos.");
			System.out.println("2- Listar todos los datos.");
			System.out.println("3- Listado de ciudades de origen y media de combustible.");
			System.out.println("4- Listado de ciudades que son origen de vuelos y tambien destino.");
			System.out.println("5- Listado de ciudades que son destino de mas de N vuelos.");
			System.out.println("6- Fin.");
			opcion=sc.nextInt();
			
			while (opcion!=6) {
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
					combustible[filaOrigen][columnaDestino]+=sc.nextInt();
					System.out.println("");
					break;
					
				case 2:
					for (int i=0; i<numCiudades; i++) {
						System.out.println("Ciudad: "+ciudades[i]+".");
						for (int j=0; j<numCiudades; j++) {
							if (combustible[i][j]>0) {
								System.out.println("Viaje "+ciudades[i]+" --> "+ciudades[j]+": "+combustible[i][j]+" litros de combustible.");
							}
						}
					}
					System.out.println("");
					break;
					
				case 3:
					int litrosCombust=0, numViajes=0;
					for (int i=0; i<numCiudades; i++) {
						for (int j=0; j<numCiudades; j++) {
							if (combustible[i][j]>0) {
								litrosCombust+=combustible[i][j];
								numViajes++;
							}
						}
						if (numViajes>0) {
							System.out.println("Ciudad: "+ciudades[i]+".");
							System.out.println("Media de combustible: "+(float)litrosCombust/numViajes+"litros de combustible.");
							litrosCombust=0;
							numViajes=0;
						}
					}
					System.out.println("");
					break;
					
				case 4:
					int origenSi=0, destinoSi=0, num=0;
					String ciudadesOrigenDestino[]=new String[numCiudades];
					for (int i=0; i<numCiudades; i++) {
						for (int j=0; j<numCiudades; j++) {
							if (combustible[i][j]>0) {
								origenSi++;
							} else if (combustible[j][i]>0) {
								destinoSi++;
							}
						}
						if (origenSi>0 && destinoSi>0) {
							ciudadesOrigenDestino[num]=ciudades[i];
							num++;
						}
						origenSi=0;
						destinoSi=0;
					}
					String ciudadesOrigenDestinoFinal[]=Arrays.copyOf(ciudadesOrigenDestino, num);
					Arrays.sort(ciudadesOrigenDestinoFinal);
					for (int i=0; i<ciudadesOrigenDestinoFinal.length; i++) {
						System.out.println(ciudadesOrigenDestinoFinal[i]+".");
					}
					System.out.println("");
					break;
					
				case 5:
					int numN, numDestino=0;
					System.out.println("Introduce un numero de vuelos.");
					numN=sc.nextInt();
					for (int i=0; i<numCiudades; i++) {
						for (int j=0; j<numCiudades; j++) {
							if (combustible[j][i]>0) {
								numDestino++;
							}
						}
						if (numDestino>numN) {
							System.out.println(ciudades[i]+".");
						}
						numDestino=0;
					}
					System.out.println("");
					break;
					
				default:
					System.out.println("Numero de opcion invalido. Vuelva a intentarlo.");
					System.out.println("");
					break;
				}
				System.out.println("Bienvenido al menu de Ryanair. Indique una opcion.");
				System.out.println("");
				System.out.println("1- Introducir datos.");
				System.out.println("2- Listar todos los datos.");
				System.out.println("3- Listado de ciudades de origen y media de combustible.");
				System.out.println("4- Listado de ciudades que son origen de vuelos y tambien destino.");
				System.out.println("5- Listado de ciudades que son destino de mas de N vuelos.");
				System.out.println("6- Fin.");
				opcion=sc.nextInt();
			}
		}
	}
}