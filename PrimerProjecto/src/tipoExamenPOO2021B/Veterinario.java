package tipoExamenPOO2021B;

public class Veterinario extends SerVivo {
	public Veterinario(String nombre) {
		super(nombre);
	}

	public String toString() {
		return "Veterinario: " + this.nombre;
	}

}
