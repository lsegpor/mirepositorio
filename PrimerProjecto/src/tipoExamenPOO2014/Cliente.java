package tipoExamenPOO2014;

public class Cliente {
	private String dni;
	private String nombre;
	private Cuenta[] tCuentas;
	private int nCuentas;

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

	public Cuenta[] gettCuentas() {
		return tCuentas;
	}

	public int getnCuentas() {
		return nCuentas;
	}
}