package ejsTipoExamenTablas;
import java.util.Scanner;

public class Ej2020_2021_1 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			float sucursal[][]=new float [20][20], sumaSucEnv=0, sumaSucRecib=0, sumaMayor=0;
			int sucManda, sucRecibe, numRecibe=0, masDiezMil=0;
			System.out.println("1- Introducir transferencia de una sucursal a otra.");
			System.out.println("2- Mostrar todos los datos introducidos.");
			System.out.println("3- Mostrar sucursal que ha recibido mas dinero.");
			System.out.println("4- Mostrar en cuantas sucursales el total de lo enviado supera 10.000€.");
			System.out.println("5- Finalizar.");
			int opcion=sc.nextInt();
			
			while (opcion!=5) {
				switch (opcion) {
				case 1:
					System.out.println("Introduce el numero de la sucursal remitente, el numero de la destinataria y la cantidad transferida.");
					sucManda=sc.nextInt();
					sucRecibe=sc.nextInt();
					sucursal[sucManda][sucRecibe]=sc.nextFloat();
					System.out.println("Datos almacenados.");
					System.out.println("");
					break;
					
				case 2:
					for (int i=0; i<sucursal.length; i++) {
						for (int j=0; j<sucursal.length; j++) {
							sumaSucEnv=sumaSucEnv+sucursal[i][j];
						}
						if (sumaSucEnv>0) {
							System.out.println("La sucursal num. "+i+" ha enviado:");
							for (int k=0; k<sucursal.length; k++) {
								if (sucursal[i][k]>0) {
									System.out.println("a la sucursal "+k+", "+sucursal[i][k]+"€.");
								}
							}
						}
						sumaSucEnv=0;
					}
					System.out.println("");
					break;
					
				case 3:
					for (int i=0; i<sucursal.length; i++) {
						for (int j=0; j<sucursal.length; j++) {
							sumaSucRecib=sumaSucRecib+sucursal[j][i];
						}
						if (sumaSucRecib>=sumaMayor) {
							sumaMayor=sumaSucRecib;
							numRecibe=i;
						}
						sumaSucRecib=0;
					}
					System.out.println("La sucursal que ha recibido mas dinero es la: "+numRecibe+" que recibio un total de: "+sumaMayor+"€.");
					System.out.println("");
					break;
					
				case 4:
					for (int i=0; i<sucursal.length; i++) {
						for (int j=0; j<sucursal.length; j++) {
							sumaSucEnv=sumaSucEnv+sucursal[i][j];
						}
						if (sumaSucEnv>10000) {
							masDiezMil++;
						}
						sumaSucEnv=0;
					}
					System.out.println("El numero de sucursales que enviaron mas de 10.000€ fue: "+masDiezMil+".");
					System.out.println("");
					break;
					
				default:
					System.out.println("Numero de opcion invalido. Vuelva a intentarlo.");
					System.out.println("");
					break;
				}
				System.out.println("1- Introducir transferencia de una sucursal a otra.");
				System.out.println("2- Mostrar todos los datos introducidos.");
				System.out.println("3- Mostrar sucursal que ha recibido mas dinero.");
				System.out.println("4- Mostrar en cuantas sucursales el total de lo enviado supera 10.000€.");
				System.out.println("5- Finalizar.");
				opcion=sc.nextInt();
			}
		}
	}
}