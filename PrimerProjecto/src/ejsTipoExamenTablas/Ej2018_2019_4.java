package ejsTipoExamenTablas;
import java.util.Scanner;

public class Ej2018_2019_4 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int opcion;
			System.out.println("1- Introducir votos obtenidos en una ciudad por un partido.");
			System.out.println("2- Listado alabetico por partidos de todos los datos introducidos.");
			System.out.println("3- Listado de mejores resultados de cada partido.");
			System.out.println("4- Listado de localidades de menor a mayor participacion.");
			System.out.println("5- Porcentajes de votos obtenidos por cada partido en la comunidad.");
			System.out.println("6- Fin.");
			opcion=sc.nextInt();
			
			while (opcion!=6) {
				switch (opcion) {
				case 1:
					System.out.println("");
					break;
				
				case 2:
					System.out.println("");
					break;
					
				case 3:
					System.out.println("");
					break;
					
				case 4:
					System.out.println("");
					break;
					
				case 5:
					System.out.println("");
					break;
					
				default:
					System.out.println("");
					break;
				}
				System.out.println("1- Introducir votos obtenidos en una ciudad por un partido.");
				System.out.println("2- Listado alabetico por partidos de todos los datos introducidos.");
				System.out.println("3- Listado de mejores resultados de cada partido.");
				System.out.println("4- Listado de localidades de menor a mayor participacion.");
				System.out.println("5- Porcentajes de votos obtenidos por cada partido en la comunidad.");
				System.out.println("6- Fin.");
				opcion=sc.nextInt();
			}
		}
	}
}