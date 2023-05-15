package poo1;

public class Persona {
	private String nombre;
	private static Dia hoy;
	
	public Persona() {
		super();
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Dia getHoy() {
		return hoy;
	}

	public static void setHoy(Dia hoy) {
		Persona.hoy = hoy;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}


}
