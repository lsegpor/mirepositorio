package examenColecciones2021A;

public class Empresa implements Comparable<Empresa> {
	private String nombre;
	private float compras;

	public Empresa(String nombre, float compras) {
		super();
		this.nombre = nombre;
		this.compras = compras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getCompras() {
		return compras;
	}

	public void setCompras(float compras) {
		this.compras = compras;
	}

	@Override
	public String toString() {
		return nombre;
	}

	@Override
	public int compareTo(Empresa o) {
		return nombre.compareTo(o.nombre);
	}


}