package boletin6;
import java.util.Scanner;

/*Queremos desarrollar una aplicación que nos ayude a gestionar las
notas de un centro educativo. Cada clase está compuesta por 5 alumnos. Se pide
leer las notas (números enteros) de cada uno de los alumnos en el primer trimestre,
luego, las del segundo, y luego, las del tercero. Debemos mostrar, al final, la nota
media del grupo en cada trimestre, y la media del alumno que se encuentra en la
posición pos (que se lee por teclado). (Podéis hacerlo usando 3 vectores -uno por
trimestre-, o usando una matriz bidimensional en la que las filas sean los trimestres
y las columnas los alumnos).*/

public class Ej07 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			int notas[][]=new int [3][5];
			System.out.println("Introduce las notas de los alumnos de los tres trimestres.");
			for (int i=0; i<3; i++) {
				for (int j=0; j<5; j++) {
					notas[i][j]=sc.nextInt();
				}
			}
			float media=0, mediaAlumno=0;
			for (int f=0; f<3; f++) {
				for (int k=0; k<5; k++) {
					media=media+notas[f][k];
				}
				System.out.println("La media del trimestre "+(f+1)+" es "+(media/5)+".");
				media=0;
			}
			System.out.println("Introduce el numero de un alumno del que quieras saber su media total.");
			int alumno=sc.nextInt();
			if (alumno>5 || alumno<=0) {
				System.out.println("Numero de alumno invalido. Te quedas sin saber su media.");
			} else {
				for (int m=0; m<3; m++) {
					mediaAlumno=mediaAlumno+notas[m][alumno-1];
				}
				System.out.println("La media total del alumno "+alumno+" es "+(mediaAlumno/3)+".");
			}
		}
	}
}