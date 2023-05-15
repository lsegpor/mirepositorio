package ejsTipoExamen;
import java.util.Scanner;

public class Ej2015_2016_1 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			String codigo, nomDep, nomProf, nomAlumno, nomEspecialidad, nomTitulo, nomDepMasProf, nomAlumnoMasNota, nomEspecialidad1, nomEspecialidad2, nomTituloMenosHoras, nomDepMediaAñosProf, nomAlumnoMasNotaGrupo;
			char letra, letraClase;
			int i, clasesBach, contAlum, numProfDep, numMaxProfDep, numMinProfDep, añosProf, asigTotal, numAsignaturas, horasTotales, mediaAsig, numFpMas1500Horas, mediaAñosProf, totalAñosProf, minHorasFp;
			float notaMedia, mediaMayor, mediaMayorGrupo;
			mediaMayor=-1;
			mediaMayorGrupo=-1;
			asigTotal=0;
			numFpMas1500Horas=0;
			numMaxProfDep=0;
			clasesBach=0;
			totalAñosProf=0;
			contAlum=1;
			minHorasFp=2501;
			numMinProfDep=Integer.MAX_VALUE;
			nomAlumnoMasNota=null;
			nomAlumnoMasNotaGrupo=null;
			nomEspecialidad1=null;
			nomEspecialidad2=null;
			nomTituloMenosHoras=null;
			nomDepMediaAñosProf=null;
			nomDepMasProf=null;
			nomAlumno=null;
			
			System.out.println("Introduce el codigo de la unidad.");
			codigo=sc.next();
			while (!codigo.equals("fin")) {
				letra=codigo.charAt(0);
				if (letra=='D') {
					System.out.println("Introduce el nombre del departamento.");
					nomDep=sc.next();
					System.out.println("Introduce el numero de profesores de ese departamento.");
					numProfDep=sc.nextInt();
					for (i=1; i<=numProfDep; i++) {
						System.out.println("Introduce el nombre del profesor "+i+" del departamento.");
						nomProf=sc.next();
						System.out.println("Introduce el numero de años que lleva ese profesor en el centro.");
						añosProf=sc.nextInt();
						if (añosProf>40) {
							System.out.println("Un profesor no puede llevar mas de 40 años en el centro.");
						}
						if (numProfDep>numMaxProfDep) {
							numMaxProfDep=numProfDep;
							nomDepMasProf=nomDep;
						}
						totalAñosProf=totalAñosProf+añosProf;
						mediaAñosProf=totalAñosProf/numProfDep;
						if (mediaAñosProf<numMinProfDep) {
							numMinProfDep=mediaAñosProf;
							nomDepMediaAñosProf=nomDep;
						}
					}
				} else if (letra=='C') {
					System.out.println("Introduce la letra de la clase.");
					letraClase=sc.next().charAt(0);
					switch (letraClase) {
					case 'E':
						System.out.println("Introduce el nombre del alumno "+contAlum+".");
						nomAlumno=sc.next();
						while (!nomAlumno.equals("fin")) {
							System.out.println("Introduce la nota media del alumno "+contAlum+".");
							notaMedia=sc.nextFloat();
							if (notaMedia>mediaMayorGrupo) {
								mediaMayorGrupo=notaMedia;
								nomAlumnoMasNotaGrupo=nomAlumno;
							}
							contAlum++;
							System.out.println("Introduce el nombre del alumno "+contAlum+".");
							nomAlumno=sc.next();
						}
						if (contAlum<=20 && mediaMayorGrupo>mediaMayor) {
							mediaMayor=mediaMayorGrupo;
							nomAlumnoMasNota=nomAlumnoMasNotaGrupo;
						}
						mediaMayorGrupo=-1;
						nomAlumnoMasNotaGrupo=null;
						contAlum=0;
						break;
					case 'P':
						System.out.println("Introduce el nombre de la especialidad.");
						nomEspecialidad=sc.next();
						nomEspecialidad2=nomEspecialidad1;
						nomEspecialidad1=nomEspecialidad;
						break;
					case 'B':
						System.out.println("Introduce el numero de asignaturas que tiene.");
						numAsignaturas=sc.nextInt();
						asigTotal=asigTotal+numAsignaturas;
						clasesBach++;
						break;
					case 'F':
						System.out.println("Introduce el nombre del titulo de esa FP.");
						nomTitulo=sc.next();
						System.out.println("Introduce el numero de horas totales de duracion de la FP.");
						horasTotales=sc.nextInt();
						if (horasTotales<minHorasFp) {
							minHorasFp=horasTotales;
							nomTituloMenosHoras=nomTitulo;
						}
						if (horasTotales>2500) {
							System.out.println("Las FP no pueden durar mas de 2500 horas totales.");
						} else if (horasTotales>1500) {
							numFpMas1500Horas++;
						}
						break;
					default:
						System.out.println("La letra introducida no corresponde a ningun tipo de clase.");
						break;
					}
				} else {
					System.out.println("La letra del codigo introducido es incorrecta.");
				}
				System.out.println("Introduce el codigo de la unidad.");
				codigo=sc.next();
			}
			mediaAsig=asigTotal/clasesBach;
			System.out.println("El nombre del departamento con mas profesores es "+nomDepMasProf+".");
			if (mediaMayor>-1) {
				System.out.println("El alumno de ESO de una clase de menos de 20 alumnos que ha tenido mayor nota media ha sido "+nomAlumnoMasNota+".");
			}
			if (nomEspecialidad1!=null && nomEspecialidad2!=null) {
				System.out.println("Las dos ultimas especialidades de clases PCPI introducidas han sido "+nomEspecialidad2+" y "+nomEspecialidad1+".");
			} else if (nomEspecialidad2==null && nomEspecialidad1!=null) {
				System.out.println("Solo se ha introducido una clase de PCPI y su especialidad es "+nomEspecialidad1+".");
			} else {
				System.out.println("No se han introducido especialidades de clases PCPI.");
			}
			System.out.println("La media del numero de asignaturas de bachillerato es "+mediaAsig+".");
			System.out.println("Hay "+numFpMas1500Horas+" clases de FP con mas de 1500 horas de duracion.");
			System.out.println("La clase de FP de menor duracion es "+nomTituloMenosHoras+".");
			System.out.println("El nombre del departamento con menor media de años de permanencia en el centro de sus profesores es "+nomDepMediaAñosProf+".");
		}
	}
}