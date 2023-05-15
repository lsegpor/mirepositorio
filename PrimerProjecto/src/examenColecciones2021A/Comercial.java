package examenColecciones2021A;

public class Comercial implements Comparable<Comercial> {
	private String nombre;
	private float ventas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getVentas() {
		return ventas;
	}

	public void setVentas(float ventas) {
		this.ventas = ventas;
	}

	public Comercial(String nombre, float ventas) {
		super();
		this.nombre = nombre;
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public int compareTo(Comercial o) {
		int compi = nombre.compareTo(o.nombre);
		if (compi == 0) {
			compi = (int) ((int) ventas - o.ventas);
		}
		return compi;
	}
}