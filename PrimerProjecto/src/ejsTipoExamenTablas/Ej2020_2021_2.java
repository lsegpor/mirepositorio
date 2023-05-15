package ejsTipoExamenTablas;
import java.util.Scanner;

public class Ej2020_2021_2 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			float sobres[][]=new float[20][12], sumaMes=0, masDinero=0, menosDinero=Float.MAX_VALUE;
			int opcion, mes, num=0, cont=1, numMasDinero=0, mesMenosDinero=0;
			System.out.println("1- Introducir datos del envio de un sobre.");
			System.out.println("2- Mostrar todos los datos introducidos.");
			System.out.println("3- Mostrar el numero del mes en que se envio mas dinero en total, y la cantidad.");
			System.out.println("4- Mostrar cual fue el numero del mes cuyo ultimo sobre tenia menos dinero.");
			System.out.println("5- Finalizar.");
			opcion=sc.nextInt();
			
			while (opcion!=5) {
				switch (opcion) {
				case 1:
					num=0;
					System.out.println("Introduce el numero del mes del envio y la cantidad del sobre.");
					mes=sc.nextInt();
					while (sobres[num][mes-1]!=0) {
						num++;
					}
					sobres[num][mes-1]=sc.nextFloat();
					System.out.println("Datos almacenados.");
					System.out.println("");
					break;
					
				case 2:
					sumaMes=0;
					for (int i=0; i<12; i++) {
						for (int j=0; j<20; j++) {
							sumaMes=sumaMes+sobres[j][i];
						}
						if (sumaMes>0) {
							System.out.println("Mes: "+(i+1)+":");
							for (int k=0; k<20; k++) {
								if (sobres[k][i]>0) {
									System.out.print(cont+": "+sobres[k][i]+" ");
									cont++;
								}
							}
						}
						System.out.println("");
						sumaMes=0;
						cont=1;
					}
					break;
					
				case 3:
					sumaMes=0;
					for (int i=0; i<12; i++) {
						for (int j=0; j<20; j++) {
							sumaMes=sumaMes+sobres[j][i];
						}
						if (sumaMes>=masDinero) {
							masDinero=sumaMes;
							numMasDinero=i;
						}
						sumaMes=0;
					}
					System.out.println("El mes que mas dinero se envio en sobres fue el numero: "+(numMasDinero+1)+" con un total de: "+masDinero+".");
					System.out.println("");
					break;
					
				case 4:
					for (int i=0; i<12; i++) {
						int j=0;
						if (sobres[j][i]>0) {
							while (sobres[j][i]>0 && j<20) {
								j++;
							}
							if (sobres[j-1][i]<menosDinero) {
								menosDinero=sobres[j-1][i];
								mesMenosDinero=i;
							}
						}
					}
					System.out.println("El mes cuyo ultimo sobre contenia menos dinero fue el numero: "+(mesMenosDinero+1)+" y tenia la cantidad: "+menosDinero+".");
					System.out.println("");
					break;
					
				default:
					System.out.println("Numero de opcion invalido. Vuelva a intentarlo.");
					System.out.println("");
					break;
				}
				System.out.println("1- Introducir datos del envio de un sobre.");
				System.out.println("2- Mostrar todos los datos introducidos.");
				System.out.println("3- Mostrar el numero del mes en que se envio mas dinero en total, y la cantidad.");
				System.out.println("4- Mostrar cual fue el numero del mes cuyo ultimo sobre tenia menos dinero.");
				System.out.println("5- Finalizar.");
				opcion=sc.nextInt();
			}
		}
	}
}