package poo3;
import java.util.Objects;

public abstract class Mascota implements Comparable<Mascota> {
	protected String nombre;
	protected Integer edad;
	protected Origen origen;
	
	public Mascota() {
		super();
	}

	public Mascota(String nombre, int edad, Origen origen) {
		super();
		setNombre(nombre);
		setEdad(edad);
		setOrigen(origen);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Origen getOrigen() {
		return origen;
	}

	public void setOrigen(Origen origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Mascota --> nombre: "+nombre+", edad: "+edad+", origen: "+origen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, origen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this==obj)
			return true;
		if (obj==null)
			return false;
		if (getClass()!=obj.getClass())
			return false;
		Mascota other=(Mascota) obj;
		return edad==other.edad && Objects.equals(nombre, other.nombre) && origen==other.origen;
	}
	
	@Override
	public int compareTo(Mascota obj) {
		if (this.edad==obj.edad) {
			return this.nombre.compareTo(obj.nombre);
		} else {
			return this.edad.compareTo(obj.edad);
		}
	}
}
