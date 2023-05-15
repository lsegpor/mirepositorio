package poo1;

public class Sintonizador {
	//atributos
	private double frecuencia=80;
	private final double FRECUENCIA_MAX=108;
	private final double FRECUENCIA_MIN=80;
	private final double SALTO=0.5;
	
	//constructores
	public Sintonizador() {
		super();
	}

	//getters y setters
	public double getFrecuencia() {
		return frecuencia;
	}

	//en verdad no haría falta set frecuencia pero lo dejo pa la prueba en la mainCoso1
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public double getFrecuenciaMax() {
		return FRECUENCIA_MAX;
	}

	public double getFrecuenciaMin() {
		return FRECUENCIA_MIN;
	}
	
	//métodos
	public double subirFrecuencia(double sint) {
		double nuevaSint=sint+SALTO;
		if (nuevaSint>FRECUENCIA_MAX) {
			nuevaSint=FRECUENCIA_MIN;
		}
		frecuencia=nuevaSint;
		return nuevaSint;
	}
	
	public double bajarFrecuencia(double sint) {
		double nuevaSint=sint-SALTO;
		if (nuevaSint<FRECUENCIA_MIN) {
			nuevaSint=FRECUENCIA_MAX;
		}
		frecuencia=nuevaSint;
		return nuevaSint;
	}

	public String toString() {
		return "Frecuencia: "+frecuencia+"MHz.";
	}
	
	
}
