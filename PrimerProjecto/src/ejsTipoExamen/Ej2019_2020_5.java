package ejsTipoExamen;
import java.util.Scanner;

public class Ej2019_2020_5 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			String email, codigo, codigoUnico, codigoMayor, emailMayor;
			char premium;
			int unidades, numPremium, numNormal, numArt, clientesPmas5, totalUnidades, mayorUnidadesP, mayorUnidadesN;
			float precio, precioTotalP, precioTotalN, precioUnico, precioMayor, totalGastado, totalGastadoMayor;
			double porcentPremium;
			numPremium=0;
			numNormal=0;
			precioTotalP=0;
			precioTotalN=0;
			numArt=0;
			precio=0;
			precioUnico=0;
			precioMayor=0;
			totalGastado=0;
			totalGastadoMayor=0;
			clientesPmas5=0;
			totalUnidades=0;
			mayorUnidadesP=0;
			mayorUnidadesN=0;
			codigoUnico=null;
			codigoMayor=null;
			emailMayor=null;
			
			System.out.print("Correo cliente: ");
			email=sc.next();
			while (!email.equals("fin")) {
				System.out.print("Premium: ");
				premium=sc.next().charAt(0);
				if (premium=='S') {
					numPremium++;
				} else {
					numNormal++;
				}
				System.out.print("Codigo de articulo: ");
				codigo=sc.next();
				while (!codigo.equals("fin")) {
					numArt++;
					System.out.print("Unidades: ");
					unidades=sc.nextInt();
					totalUnidades=totalUnidades+unidades;
					System.out.print("Precio unitario: ");
					precio=sc.nextFloat();
					if (numArt==1) {
						precioUnico=precio;
						codigoUnico=codigo;
					}
					totalGastado=totalGastado+precio*unidades;
					if (premium=='S') {
						precioTotalP=precioTotalP+precio*unidades;
					} else {
						precioTotalN=precioTotalN+precio*unidades;
					}
					System.out.print("Codigo de articulo: ");
					codigo=sc.next();
				}
				if (numArt==1) {
					if (precioUnico>precioMayor) {
						precioMayor=precioUnico;
						codigoMayor=codigoUnico;
					}
				} else if (numArt>=5 && premium=='S') {
					clientesPmas5++;
				}
				if (totalGastado>totalGastadoMayor) {
					totalGastadoMayor=totalGastado;
					emailMayor=email;
				}
				if (totalUnidades>mayorUnidadesP && premium=='S') {
					mayorUnidadesP=totalUnidades;
				}
				if (totalUnidades>mayorUnidadesN && premium=='N') {
					mayorUnidadesN=totalUnidades;
				}
				totalUnidades=0;
				totalGastado=0;
				numArt=0;
				System.out.print("Correo cliente: ");
				email=sc.next();
			}
			porcentPremium=100*(double)numPremium/(numPremium+numNormal);
			System.out.println("Porcentaje de clientes premium: "+porcentPremium+"%.");
			if (precioTotalP>precioTotalN) {
				System.out.println("Han gastado mas dinero los clientes Premium.");
			} else {
				System.out.println("Han gastado mas dinero los clientes normales.");
			}
			System.out.println("El codigo del articulo mas caro de los clientes que compraron un solo articulo es: "+codigoMayor);
			System.out.println("Cliente que gasto mas dinero: "+emailMayor);
			System.out.println("Numero de clientes premium que compraron al menos 5 articulos distintos: "+clientesPmas5);
			if (mayorUnidadesP>mayorUnidadesN) {
				System.out.println("El cliente que compro mas unidades de articulos en total era Premium.");
			} else {
				System.out.println("El cliente que compro mas unidades de articulos en total era Normal.");
			}
		}
	}
}