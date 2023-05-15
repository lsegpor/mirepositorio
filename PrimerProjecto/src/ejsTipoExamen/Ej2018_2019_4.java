package ejsTipoExamen;
import java.util.Scanner;

public class Ej2018_2019_4 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			String nomClase, nomTutor, nomAlumno, nomClaseMasAprob, nomTutorMenosSus;
			int notaControl, notaFinal, notaClase, numAprob, masAprob, numSus, clasesMasAprob, notaFinalAprob, numAlumnos, numAlumnosTotal, notaControlAprob, clase3Aprob;
			double notaGlobal, porcentSus, menorPorcentSus, porcentAprob;
			numAprob=0;
			masAprob=0;
			numSus=0;
			clasesMasAprob=0;
			notaFinalAprob=0;
			numAlumnos=0;
			numAlumnosTotal=0;
			notaControlAprob=0;
			clase3Aprob=0;
			menorPorcentSus=Double.MAX_VALUE;
			nomClaseMasAprob=null;
			nomTutorMenosSus=null;
			
			System.out.print("Nombre de la clase: ");
			nomClase=sc.next();
			while (!nomClase.equals("fin")) {
				System.out.print("Nombre del tutor: ");
				nomTutor=sc.next();
				System.out.print("Nombre del alumno: ");
				nomAlumno=sc.next();
				while (!nomAlumno.equals("fin")) {
					numAlumnos++;
					numAlumnosTotal++;
					System.out.print("Nota control1: ");
					notaControl=sc.nextInt();
					if (notaControl>=5) {
						notaControlAprob++;
					}
					System.out.print("Nota examen final: ");
					notaFinal=sc.nextInt();
					if (notaFinal>=5) {
						notaFinalAprob++;
					}
					System.out.print("Nota clase: ");
					notaClase=sc.nextInt();
					notaGlobal=0.6*notaFinal+0.3*notaControl+0.1*notaClase;
					if (notaGlobal>=5) {
						numAprob++;
					} else {
						numSus++;
					}
					if (numAlumnos==3 && notaControlAprob==3) {
						clase3Aprob++;
					}
					System.out.print("Nombre del alumno: ");
					nomAlumno=sc.next();
				}
				if (numAprob>numSus) {
					clasesMasAprob++;
				}
				porcentSus=(100*(double)numSus/(numSus+numAprob));
				if (porcentSus<menorPorcentSus) {
					menorPorcentSus=porcentSus;
					nomTutorMenosSus=nomTutor;
				}
				if (numAprob>masAprob) {
					masAprob=numAprob;
					nomClaseMasAprob=nomClase;
				}
				numAprob=0;
				numSus=0;
				numAlumnos=0;
				notaControlAprob=0;
				System.out.print("Nombre de la clase: ");
				nomClase=sc.next();
			}
			porcentAprob=(100*(double)notaFinalAprob/numAlumnosTotal);
			System.out.println("El nombre de la clase con mayor numero neto de alumnos con la nota global aprobada es "+nomClaseMasAprob+".");
			System.out.println("El nombre del tutor de la clase con menos porcentaje de suspensos es "+nomTutorMenosSus+" con un pocentaje de "+menorPorcentSus+"%.");
			System.out.println("Hay "+clasesMasAprob+" clases con mas numero de aprobados que de suspensos.");
			System.out.println("El porcentaje total de alumnos con el examen final aprobado de todo el centro es del "+porcentAprob+"%.");
			if (clase3Aprob!=0) {
				System.out.println("Hay clases donde los tres primeros alumnos introducidos tienen la nota del control1 aprobada.");
			} else {
				System.out.println("No hay ninguna clase donde los tres primeros alumnos introducidos tienen la nota del control1 aprobada.");
			}
		}
	}
}