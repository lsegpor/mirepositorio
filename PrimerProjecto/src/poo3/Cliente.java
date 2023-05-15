package poo3;
import java.util.Objects;

public class Cliente implements Comparable<Cliente> {
	private String dni;
	private String nombre;
	private int edad;
	private int saldo;
	
	public Cliente() {
		super();
	}

	public Cliente(String dni, String nombre, int edad, int saldo) {
		super();
		setDni(dni);
		setNombre(nombre);
		setEdad(edad);
		setSaldo(saldo);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Cliente --> dni: "+dni+", nombre: "+nombre+", edad: "+edad+", saldo: "+saldo+".";
	}
	
	@Override
	public int compareTo(Cliente obj) {
		return this.dni.compareTo(obj.dni);
	}
}
