package ejsTipoExamen;
import java.util.Scanner;

public class Ej2017_2018_3 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			String nomEquipo, nomJug, nomJugFichaCara, nomEquipoMasRend;
			char posicion;
			int puntos, numJug, numPort, numLat, edad, numGoles, penaltis, i;
			float precio, precioMasAlto, mediaEdadDef, mejorRend, rend, edadTotal, numDef;
			edadTotal=0;
			numDef=0;
			precioMasAlto=0;
			mejorRend=0;
			numPort=0;
			numLat=0;
			nomJugFichaCara=null;
			nomEquipoMasRend=null;
			
			System.out.print("Nombre equipo: ");
			nomEquipo=sc.next();
			while (!nomEquipo.equals("fin")) {
				System.out.print("Puntos: ");
				puntos=sc.nextInt();
				System.out.print("Numero de jugadores: ");
				numJug=sc.nextInt();
				for (i=1; i<=numJug; i++) {
					System.out.print("Nombre: ");
					nomJug=sc.next();
					System.out.print("Edad: ");
					edad=sc.nextInt();
					System.out.print("Ficha: ");
					precio=sc.nextFloat();
					if (numJug<7) {
						if (precio>precioMasAlto) {
							precioMasAlto=precio;
							nomJugFichaCara=nomJug;
						}
					}
					System.out.print("Posicion: ");
					posicion=sc.next().charAt(0);
					switch (posicion) {
					case 'D':
						System.out.print("Goles: ");
						numGoles=sc.nextInt();
						break;
					case 'P':
						System.out.print("Penaltis: ");
						penaltis=sc.nextInt();
						numPort++;
						break;
					case 'F':
						edadTotal=edadTotal+edad;
						numDef++;
						break;
					case 'L':
						numLat++;
						break;
					default:
						System.out.println("La letra introducida no corresponde a ninguna posicion.");
						break;
					}	
				}
				rend=puntos/numJug;
				if (rend>mejorRend) {
					mejorRend=rend;
					nomEquipoMasRend=nomEquipo;
				}
				System.out.print("Nombre equipo: ");
				nomEquipo=sc.next();
			}
			mediaEdadDef=edadTotal/numDef;
			System.out.println("La media de edad de todos los defensas de todos los equipos es de "+mediaEdadDef+" años.");
			System.out.println("El nombre del jugador con la ficha mas cara de equipos con menos de 7 jugadores es "+nomJugFichaCara+".");
			System.out.println("El nombre del equipo con mejor rendimiento de sus jugadores es "+nomEquipoMasRend+".");
			if (numPort==0 && numLat==0) {
				System.out.println("Hay equipos sin portero ni laterales.");
			} else if (numPort!=0 && numLat==0) {
				System.out.println("Hay equipos sin laterales pero con porteros.");
			} else if (numPort==0 && numLat!=0) {
				System.out.println("Hay equipos sin porteros pero con laterales.");
			} else {
				System.out.println("No hay equipos que no tengan porteros ni laterales.");
			}
		}
	}
}