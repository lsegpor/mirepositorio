package poo1;

public class PruebaSintonizador {

	public static void main(String[] args) {
		//sintonizador empieza en 80
		Sintonizador s1=new Sintonizador();
		
		//al subir, sube 0.5=80.5
		System.out.println(s1.subirFrecuencia(s1.getFrecuencia()));
		
		s1.setFrecuencia(108);
		
		//al querer subir de 108 (el máximo) lo devuelve a 80 (el mínimo)
		System.out.println(s1.subirFrecuencia(s1.getFrecuencia()));
		
		//al querer bajar de 80 (el mínimo) lo devuelve a 108 (el máximo)
		System.out.println(s1.bajarFrecuencia(s1.getFrecuencia()));
		
		//mostrar información
		System.out.println(s1.toString());
	}
}