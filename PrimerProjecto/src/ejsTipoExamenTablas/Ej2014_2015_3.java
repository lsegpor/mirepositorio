package ejsTipoExamenTablas;
import java.util.Scanner;

public class Ej2014_2015_3 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			String nombres[]=new String[30], nombresFinales[]=new String[30];
			float notas[][]=new float[30][3], notasFinales[]=new float[30];
			int opcion, num=0, positMax=Integer.MIN_VALUE;
			System.out.println("1- Introducir alumno, nota del control1 y nota del examen final del alumno.");
			System.out.println("2- Poner un positivo a un alumno.");
			System.out.println("3- Listar todos los alumnos con su nota final de evaluacion ordenado por nota.");
			System.out.println("4- Mostrar estadisticas de la evaluacion.");
			System.out.println("5- Finalizar.");
			opcion=sc.nextInt();
			
			while (opcion!=5) {
				switch (opcion) {
				case 1:
					System.out.println("Introduce el nombre del alumno, la nota de su control1 y la nota de su examen final.");
					nombres[num]=sc.next();
					notas[num][0]=sc.nextFloat();
					notas[num][1]=sc.nextFloat();
					num++;
					System.out.println("Datos almacenados.");
					System.out.println("");
					break;
					
				case 2:
					System.out.println("Indica el nombre del alumno al que quieres ponerle un positivo.");
					String nombre=sc.next();
					for (int i=0; i<nombres.length; i++) {
						if (nombres[i]!=null) {
							if (nombres[i].equals(nombre)) {
								notas[i][2]++;
							}
						}
					}
					System.out.println("");
					break;
					
				case 3:
					for (int i=0; i<30; i++) {
						if (notas[i][2]>positMax) {
							positMax=(int)notas[i][2];
						}
					}
					for (int i=0; i<30; i++) {
						int usado=0;
						if (nombres[i]!=null) {
							double notaFinal=0.3*notas[i][0]+0.6*notas[i][1]+0.1*(notas[i][2]*10/positMax);
							for (int j=0; j<30; j++) {
								if (j<29 && notaFinal>=notasFinales[j] && notaFinal<notasFinales[j+1] && usado==0) {
									for (int k=29; k>j; k--) {
										if (notasFinales[k]>0) {
											notasFinales[k+1]=notasFinales[k];
											nombresFinales[k+1]=nombresFinales[k];
										}
									}
									notasFinales[j+1]=(float)notaFinal;
									nombresFinales[j+1]=nombres[i];
									usado++;
								} else if (notaFinal>=notasFinales[j] && j<29 && notasFinales[j+1]==0 && usado==0 && notasFinales[j]!=0) {
									notasFinales[j+1]=(float)notaFinal;
									nombresFinales[j+1]=nombres[i];
									usado++;
								} else if ((usado==0 && notaFinal<notasFinales[j]) | (usado==0 && notasFinales[j]==0)) {
									for (int k=29; k>=j; k--) {
										if (notasFinales[k]>0) {
											notasFinales[k+1]=notasFinales[k];
											nombresFinales[k+1]=nombresFinales[k];
										}
									}
									notasFinales[j]=(float)notaFinal;
									nombresFinales[j]=nombres[i];
									usado++;
								}
							}
						}
					}
					for (int i=0; i<30; i++) {
						if (nombresFinales[i]!=null && notasFinales[i]!=0) {
							System.out.println(nombresFinales[i]+": "+notasFinales[i]+".");
						}
					}
					System.out.println("");
					break;
					
				case 4:
					int numNotas=0, numSus=0;
					for (int i=0; i<30; i++) {
						if (nombres[i]!=null) {
							numNotas++;
							if (notas[i][1]<5) {
								numSus++;
							}
						}
					}
					float porcent=100*(float)numSus/numNotas;
					System.out.println("Hay un "+porcent+"% de alumnos suspensos.");
					float sumNotas=0;
					int notasEval=0;
					for (int i=0; i<notasFinales.length; i++) {
						if (notasFinales[i]>0) {
							sumNotas=sumNotas+notasFinales[i];
							notasEval++;
						}
					}
					float media=(float)sumNotas/notasEval;
					System.out.println("La nota media final de evaluacion de todo el grupo ha sido de "+media+".");
					float notaMax=Float.MIN_VALUE;
					String nomMasNota=null;
					for (int i=0; i<30; i++) {
						if (notas[i][0]>notaMax) {
							notaMax=notas[i][0];
							nomMasNota=nombres[i];
						}
					}
					System.out.println("El/la alumno/a con mas nota en el control1 ha sido "+nomMasNota+" con un "+notaMax+".");
					System.out.println("");
					break;
					
				default:
					System.out.println("Numero de opcion invalido. Vuelva a intentarlo.");
					System.out.println("");
					break;
				}
				System.out.println("1- Introducir alumno, nota del control1 y nota del examen final del alumno.");
				System.out.println("2- Poner un positivo a un alumno.");
				System.out.println("3- Listar todos los alumnos con su nota final de evaluacion ordenado por nota.");
				System.out.println("4- Mostrar estadisticas de la evaluacion.");
				System.out.println("5- Finalizar.");
				opcion=sc.nextInt();
			}
		}
	}
}