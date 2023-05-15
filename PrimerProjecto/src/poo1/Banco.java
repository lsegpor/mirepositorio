package poo1;

public class Banco {
	//atributos
	private final String nombre;
	private float capital=5200000;
	private String direccionCentral;
	
	//constructores
	public Banco(String nombre, float capital, String direccionCentral) {
		super();
		this.nombre = nombre;
		this.capital = capital;
		this.direccionCentral = direccionCentral;
	}

	public Banco(String nombre, String direccionCentral) {
		super();
		this.nombre = nombre;
		this.direccionCentral = direccionCentral;
	}
	
	//getters y setters
	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public String getDireccionCentral() {
		return direccionCentral;
	}

	public void setDireccionCentral(String direccionCentral) {
		this.direccionCentral = direccionCentral;
	}

	public String getNombre() {
		return nombre;
	}

	public String toString() {
		return "Banco: " +nombre+", capital: "+capital+", direccionCentral: "+direccionCentral;
	}

	//métodos (no hay porque el tostring está en cuenta corriente)
}
