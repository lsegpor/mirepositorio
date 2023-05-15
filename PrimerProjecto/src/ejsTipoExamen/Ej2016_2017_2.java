package ejsTipoExamen;
import java.util.Scanner;

public class Ej2016_2017_2 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			String nomProv, nomProvMaxExt, nomLocal, nomLocal1, nomLocal2, nomLocal3, poseeJuz, nomDensidadMin, nomProvPoseeJuz;
			int numHab, numHabMax1, numHabMax2, numHabMax3, i, contLocal, localMenos3Hab, sumaLocal, numPoseeJuz;
			float numProv, mediaLocal, ext, sumaExt, extMedia, extMediaMax, densidad, densidadMin, porcentPoseeJuz, porcentPoseeJuzMax;
			contLocal=1;
			sumaLocal=0;
			extMediaMax=0;
			sumaExt=0;
			numHabMax1=0;
			numHabMax2=0;
			numHabMax3=0;
			localMenos3Hab=0;
			numPoseeJuz=0;
			porcentPoseeJuzMax=0;
			densidadMin=Float.MAX_VALUE;
			nomProvMaxExt=null;
			nomLocal1=null;
			nomLocal2=null;
			nomLocal3=null;
			nomDensidadMin=null;
			nomProvPoseeJuz=null;
			
			System.out.print("Numero de provincias: ");
			numProv=sc.nextInt();
			for (i=1; i<=numProv; i++) {
				System.out.print("Nombre de la provincia "+i+": ");
				nomProv=sc.next();
				System.out.print("Nombre de la localidad "+contLocal+": ");
				nomLocal=sc.next();
				while (!nomLocal.equals("fin")) {
					System.out.print("Habitantes: ");
					numHab=sc.nextInt();
					System.out.print("Extension: ");
					ext=sc.nextFloat();
					sumaExt=sumaExt+ext;
					System.out.print("Posee juzgados: ");
					poseeJuz=sc.next();
					if (poseeJuz.equals("Si")) {
						numPoseeJuz++;
					}
					if (numHab>numHabMax1) {
						numHabMax3=numHabMax2;
						nomLocal3=nomLocal2;
						numHabMax2=numHabMax1;
						nomLocal2=nomLocal1;
						numHabMax1=numHab;
						nomLocal1=nomLocal;
					} else if (numHab>numHabMax2) {
						numHabMax3=numHabMax2;
						nomLocal3=nomLocal2;
						numHabMax2=numHab;
						nomLocal2=nomLocal;
					} else if (numHab>numHabMax3) {
						numHabMax3=numHab;
						nomLocal3=nomLocal;
					}
					densidad=numHab/ext;
					if (densidad<densidadMin) {
						densidadMin=densidad;
						nomDensidadMin=nomLocal;
					}
					contLocal++;
					sumaLocal++;
					System.out.print("Nombre de la localidad "+contLocal+": ");
					nomLocal=sc.next();
				}
				contLocal--;
				if (contLocal<3) {
					localMenos3Hab++;
				}
				extMedia=sumaExt/contLocal;
				if (extMedia>extMediaMax) {
					extMediaMax=extMedia;
					nomProvMaxExt=nomProv;
				}
				porcentPoseeJuz=numPoseeJuz/contLocal*100;
				if (porcentPoseeJuz>porcentPoseeJuzMax) {
					porcentPoseeJuzMax=porcentPoseeJuz;
					nomProvPoseeJuz=nomProv;
					
				}
				contLocal=1;
			}
			mediaLocal=sumaLocal/numProv;
			System.out.println("La provincia con mayor extension media de sus localidades es "+nomProvMaxExt+".");
			System.out.println("Las tres localidades con mas habitantes son "+nomLocal1+", "+nomLocal2+" y "+nomLocal3+".");
			System.out.println("El numero medio de localidades por provincia es de "+mediaLocal+" localidades.");
			if (localMenos3Hab>0) {
				System.out.println("Existen provincias con menos de 3 localidades.");
			}
			System.out.println("La localidad con menor densidad de poblacion es "+nomDensidadMin+".");
			System.out.println("La provincia con mas porcentaje de localidades con juzgado es "+nomProvPoseeJuz+".");
		}
	}
}