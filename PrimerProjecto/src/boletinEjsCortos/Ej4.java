package boletinEjsCortos;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int region, prov, votos, votosA, votosAFinal, votosAProv, votosB, votosBFinal, votosBProv, abst, abstTotal, muchasAbst;
			float porcentVotosA, porcentVotosB, porcentAbst;
			String nombre, nombreAFinal, nombreBFinal;
			nombreAFinal=null;
			nombreBFinal=null;
			votosA=0;
			votosAFinal=0;
			votosBFinal=0;
			votosB=0;
			abstTotal=0;
			muchasAbst=0;
			votosAProv=0;
			votosBProv=0;
			System.out.println("Introduce el numero de la region donde vamos a introducir datos.");
			region=sc.nextInt();
			switch (region) {
			case 1:
				for (prov=1; prov<=10; prov++) {
					System.out.println("Introduce el nombre de la provincia "+prov+".");
					nombre=sc.next();
					System.out.println("Introduce el numero de votos que ha obtenido el partido A en esta provincia.");
					votos=sc.nextInt();
					votosA=votosA+votos;
					votosAProv=votosAProv+votos;
					System.out.println("Introduce el numero de votos que ha obtenido el partido A en esta provincia.");
					votos=sc.nextInt();
					votosB=votosB+votos;
					votosBProv=votosBProv+votos;
					System.out.println("Introduce el numero de abstenciones que ha obtenido esta provincia.");
					abst=sc.nextInt();
					abstTotal=abstTotal+abst;
					if (votosAProv<votosAFinal) {
						votosAFinal=votosAProv;
						nombreAFinal=nombre;
					}
					if (votosBProv>votosBFinal) {
						votosBFinal=votosBProv;
						nombreBFinal=nombre;
					}
					if (abst>100000) {
						muchasAbst++;
					}
					votosAProv=0;
					votosBProv=0;
				}
				break;
			case 2:
				for (prov=1; prov<=4; prov++) {
					System.out.println("Introduce el nombre de la provincia "+prov+".");
					nombre=sc.next();
					System.out.println("Introduce el numero de votos que ha obtenido el partido A en esta provincia.");
					votos=sc.nextInt();
					votosA=votosA+votos;
					votosAProv=votosAProv+votos;
					System.out.println("Introduce el numero de votos que ha obtenido el partido A en esta provincia.");
					votos=sc.nextInt();
					votosB=votosB+votos;
					votosBProv=votosBProv+votos;
					System.out.println("Introduce el numero de abstenciones que ha obtenido esta provincia.");
					abst=sc.nextInt();
					abstTotal=abstTotal+abst;
					if (votosAProv>votosAFinal) {
						votosAFinal=votosAProv;
						nombreAFinal=nombre;
					}
					if (votosBProv>votosBFinal) {
						votosBFinal=votosBProv;
						nombreBFinal=nombre;
					}
					if (abst>100000) {
						muchasAbst++;
					}
					votosAProv=0;
					votosBProv=0;
				}
				break;
			case 3:
				for (prov=1; prov<=6; prov++) {
					System.out.println("Introduce el nombre de la provincia "+prov+".");
					nombre=sc.next();
					System.out.println("Introduce el numero de votos que ha obtenido el partido A en esta provincia.");
					votos=sc.nextInt();
					votosA=votosA+votos;
					votosAProv=votosAProv+votos;
					System.out.println("Introduce el numero de votos que ha obtenido el partido A en esta provincia.");
					votos=sc.nextInt();
					votosB=votosB+votos;
					votosBProv=votosBProv+votos;
					System.out.println("Introduce el numero de abstenciones que ha obtenido esta provincia.");
					abst=sc.nextInt();
					abstTotal=abstTotal+abst;
					if (votosAProv>votosAFinal) {
						votosAFinal=votosAProv;
						nombreAFinal=nombre;
					}
					if (votosBProv>votosBFinal) {
						votosBFinal=votosBProv;
						nombreBFinal=nombre;
					}
					if (abst>100000) {
						muchasAbst++;
					}
					votosAProv=0;
					votosBProv=0;
				}
				break;
			case 4:
				for (prov=1; prov<=1; prov++) {
					System.out.println("Introduce el nombre de la provincia "+prov+".");
					nombre=sc.next();
					System.out.println("Introduce el numero de votos que ha obtenido el partido A en esta provincia.");
					votos=sc.nextInt();
					votosA=votosA+votos;
					votosAProv=votosAProv+votos;
					System.out.println("Introduce el numero de votos que ha obtenido el partido A en esta provincia.");
					votos=sc.nextInt();
					votosB=votosB+votos;
					votosBProv=votosBProv+votos;
					System.out.println("Introduce el numero de abstenciones que ha obtenido esta provincia.");
					abst=sc.nextInt();
					abstTotal=abstTotal+abst;
					if (votosAProv>votosAFinal) {
						votosAFinal=votosAProv;
						nombreAFinal=nombre;
					}
					if (votosBProv>votosBFinal) {
						votosBFinal=votosBProv;
						nombreBFinal=nombre;
					}
					if (abst>100000) {
						muchasAbst++;
					}
					votosAProv=0;
					votosBProv=0;
				}
				break;
			default:
				System.out.println("El numero introducido no corresponde a ninguna region autonomica.");
			break;
			}
			porcentVotosA=(float) votosA/(votosA+votosB+abstTotal)*100;
			porcentVotosB=(float) votosB/(votosA+votosB+abstTotal)*100;
			porcentAbst=(float) abstTotal/(votosA+votosB+abstTotal)*100;
			System.out.println("El partido A ha recibido un "+porcentVotosA+"% de votos en la region "+region+".");
			System.out.println("El partido B ha recibido un "+porcentVotosB+"% de votos en la region "+region+".");
			System.out.println("Han habido un "+porcentAbst+"% de abstenciones en la region "+region+".");
			System.out.println("La provincia que ha obtenido mas votos del partido A ha sido "+nombreAFinal+".");
			System.out.println("La provincia que ha obtenido mas votos del partido B ha sido "+nombreBFinal+".");
			if (muchasAbst!=0) {
				System.out.println("Altas abstenciones.");
			}
		}
	}
}
