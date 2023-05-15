package poo1;
//corrígelo bestie!!

//ejercicio 5
public class Texto {
	//atributos
	private String cadena="";
	private int limiteTamanyo;
	private final String VOCALES="aAeEiIoOuU";
	
	//constructores
	public Texto(int limiteTamanyo) {
		super();
		setLimiteTamanyo(limiteTamanyo);
	}
	
	//getters y setters
	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		if (cadena.length()<=this.limiteTamanyo) {
			this.cadena = cadena;
		}
	}

	public int getLimiteTamanyo() {
		return limiteTamanyo;
	}

	public void setLimiteTamanyo(int limiteTamanyo) {
		if (limiteTamanyo>=this.cadena.length()) {
			this.limiteTamanyo = limiteTamanyo;
		}
	}
	
	//métodos
	public boolean añadir (boolean principio, String palabra) {
		boolean haPodido=false;
		if (this.cadena.length()+palabra.length()<=limiteTamanyo) {
			haPodido=true;
			if (principio==true) {
				this.cadena=palabra+this.cadena;
			} else {
				this.cadena=this.cadena+palabra;
			}
		}
		return haPodido;
	}
	
	public int numVocales () {
		int num=0;
		for (int i=0; i<this.cadena.length(); i++) {
			if (this.cadena.charAt(i)=='a' || this.cadena.charAt(i)=='A' || this.cadena.charAt(i)=='e' || this.cadena.charAt(i)=='E'
			|| this.cadena.charAt(i)=='i' || this.cadena.charAt(i)=='I' || this.cadena.charAt(i)=='o' || 
			this.cadena.charAt(i)=='O' || this.cadena.charAt(i)=='u' || this.cadena.charAt(i)=='U') {
				num++;
			}
		}
		return num;
	}

	public String toString() {
		return "Cadena: "+cadena+", limiteTamanyo: "+limiteTamanyo+".";
	}
	
	
}