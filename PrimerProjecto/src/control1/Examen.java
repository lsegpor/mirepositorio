package control1;
import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			String tipoCuerpo, nomCuerpo, nomSatelite, nomCuerpoCercanoSol, nomCuerpoMasSat1, nomCuerpoMasSat2;
			char rotacion;
			int numSatelites, i, numPlanetasConSat, numPlanetas, numCuerpos, numSatelitesMax1, numSatelitesMax2, diamCuerpo, diamSatelite, diamTotal, diamMayor;
			float porcentPlanetasConSat, mediaDiam;
			double distanciaSol, distanciaSolMenor;
			boolean rotacionSi;
			rotacionSi=false;
			nomCuerpoCercanoSol=null;
			nomCuerpoMasSat1=null;
			nomCuerpoMasSat2=null;
			numPlanetasConSat=0;
			numPlanetas=0;
			diamTotal=0;
			numCuerpos=0;
			numSatelitesMax1=0;
			numSatelitesMax2=0;
			diamMayor=0;
			distanciaSolMenor=Double.MAX_VALUE;
			
			System.out.print("Tipo de cuerpo celeste: ");
			tipoCuerpo=sc.next();
			/* En cada iteración trato los datos de un sólo cuerpo celeste. */
			while (!tipoCuerpo.equals("fin")) {
				numCuerpos++; /* Aquí voy almacenando el total de cuerpos celestes introducidos. */
				if (tipoCuerpo.equals("planeta")) {
					numPlanetas++;
				}
				System.out.print("Nombre del cuerpo celeste: ");
				nomCuerpo=sc.next();
				System.out.print("Distancia al Sol: ");
				distanciaSol=sc.nextDouble();
				if (distanciaSol<distanciaSolMenor) {
					distanciaSolMenor=distanciaSol;
					nomCuerpoCercanoSol=nomCuerpo;
				}
				System.out.print("Diametro (kms): ");
				diamCuerpo=sc.nextInt();
				if (distanciaSol<230000000) {
					if (diamCuerpo>diamMayor) {
						/* diamMayor se refiere sólo a los cuerpos a menos de 230000000
						de distancia al sol. */
						diamMayor=diamCuerpo;
					}
				}
				diamTotal=diamTotal+diamCuerpo; /* Aquí almaceno el numero total de diametro de los cuerpos
				 								celestes introducidos. */
				if (tipoCuerpo.equals("planeta") || tipoCuerpo.equals("estrella")) {
					System.out.print("Numero de satelites: ");
					numSatelites=sc.nextInt();
					System.out.println("\n");
					numCuerpos=numCuerpos+numSatelites; /* Aquí añado al total de cuerpos introducidos
														el numero de satélites (progresivamente con cada
														iteración del while) ya que el apartado c) necesita 
														el total de cuerpos incluyendo satélites. */
					if (tipoCuerpo.equals("planeta") && numSatelites>0) {
						numPlanetasConSat++; /*Aquí voy almacenando el total de cuerpos celestes que
											 son planetas y además tienen satélites. */
					}
					if (numSatelites>0) {
						/* En esta condición, el número de satélites actual por la iteración anterior se
						almacena primero en numSatelitesMax1, y si se introduce otro valor que cumpla la 
						condición, el valor de numSatelitesMax1 pasa a numSatelitesMax2 y el nuevo valor 
						se queda en numSatelitesMax1. Si vuelve a haber otro valor que cumple la condición,
						sucede lo mismo pero el valor de NumSatelitesMax2 se desecha. */
						if (numSatelites>numSatelitesMax1) {
							numSatelitesMax2=numSatelitesMax1;
							nomCuerpoMasSat2=nomCuerpoMasSat1;
							numSatelitesMax1=numSatelites;
							nomCuerpoMasSat1=nomCuerpo;
						} else if (numSatelites>numSatelitesMax2) {
							numSatelitesMax2=numSatelites;
							nomCuerpoMasSat2=nomCuerpo;
						}
						/* En cada iteración trato los datos de un sólo satélite. */
						for (i=1; i<=numSatelites; i++) {
							System.out.print("Nombre satelite: ");
							nomSatelite=sc.next();
							System.out.print("Diametro (kms): ");
							diamSatelite=sc.nextInt();
							diamTotal=diamTotal+diamSatelite; /* Aquí añado al diametro total de cuerpos 
															  introducidos el diametro de los satélites 
															  (progresivamente con cada iteración del while) 
															  ya que el apartado c) necesita el diametro 
															  total incluyendo satélites. */
							System.out.print("Rotacion sincrona: ");
							rotacion=sc.next().charAt(0);
							if (rotacion=='S') {
								rotacionSi=true;
							}
							System.out.println("\n");
						}
						System.out.println("f) "+nomCuerpo+" tiene satelites con rotacion sincrona: "+rotacionSi+".");
						System.out.println("\n");
						rotacionSi=false; /* Aquí reinicio el boolean en su valor base para que en la siguiente iteración
										  el valor se introduzca correctamente. */
					}
				}
				/* Aquí vuelvo a proponer el requisito de la iteración para que el bucle vuelva a empezar. */
				System.out.print("Tipo de cuerpo celeste: ");
				tipoCuerpo=sc.next();
			}
			System.out.println("\n");
			porcentPlanetasConSat=100*(float)numPlanetasConSat/numPlanetas; /* Aquí calculo el porcentaje de planetas con
			 																satélites respecto al total de planetas introducidos. */
			mediaDiam=(float)diamTotal/numCuerpos; /* Aquí calculo la media del diametro total incluyendo satélites. */
			System.out.println("a) Porcentaje de planetas que tienen algun satelite: "+porcentPlanetasConSat+"%.");
			System.out.println("b) Nombre del cuerpo celeste mas cercano al sol: "+nomCuerpoCercanoSol+".");
			System.out.println("c) Diametro medio de todos los cuerpos celestes (incluyendo satelites): "+mediaDiam+" kms.");
			System.out.println("d) Nombre de los dos cuerpos celestes que mas satelites tienen: "+nomCuerpoMasSat1+" y "+nomCuerpoMasSat2+".");
			System.out.println("e) El diametro del cuerpo mas grande de entre los que estan a menos de 230000000 de distancia del sol es: "+diamMayor+".");
		}
	}
}