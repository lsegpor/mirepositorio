package poo3;

public class Cadenas implements Estadisticas<String> {

	private String[] cadena;

	public Cadenas(String[] palabras) {
		super();
		this.cadena = palabras;
	}

	@Override
	// mayor alfabeticamente
	public String mayor() {
		String max = "";
		for (String palabra : cadena) {
			if (palabra.compareTo(max) > 0) {
				max = palabra;
			}

		}

		return max;
	}

	@Override
	public String menor() {
		int longitudMin = Integer.MAX_VALUE;
		String cadenaMin = "";
		for (String cadena : cadena) {
			if (cadena.length() < longitudMin) {
				longitudMin = cadena.length();
				cadenaMin = cadena;
			}
		}
		return cadenaMin;
	}

	@Override
	public double media() {
		int sumaLongitudes = 0;
		for (String cadena : cadena) {
			sumaLongitudes += cadena.length();
		}
		return sumaLongitudes / (double) cadena.length;
	}

	@Override
	public String[] mayoresQue(String obj) {
		int contador = 0;
		for (String cadena : cadena) {
			if (cadena.length() > obj.length()) {
				contador++;
			}
		}
		String[] mayores = new String[contador];
		int indice = 0;
		for (String cadena : cadena) {
			if (cadena.length() > obj.length()) {
				mayores[indice++] = cadena;
			}
		}
		return mayores;
	}

	@Override
	public String[] menoresQue(String obj) {
		int contador = 0;
		for (String cadena : cadena) {
			if (cadena.length() < obj.length()) {
				contador++;
			}
		}
		String[] menores = new String[contador];
		int indice = 0;
		for (String cadena : cadena) {
			if (cadena.length() < obj.length()) {
				menores[indice++] = cadena;
			}
		}
		return menores;
	}
}