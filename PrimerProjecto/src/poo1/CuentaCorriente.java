package poo1;

public class CuentaCorriente {
	//atributos (modificados por ejercicio 3)
	public String nombre;
	String dni;
	private float saldo;
	private int limiteDescubierto;
	//ejercicio 6
	private Banco banco;
	
	//ejercicio 4 (lo comento porque en el ejercicio 5 se hace aparte)
	/*static String nombreBanco="BBVA";*/
	
	//constructores
	public CuentaCorriente() {
		super();
	}

	public CuentaCorriente(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		saldo=0;
		limiteDescubierto=-50;
	}
	
	//añadidos en el ejercicio 2
	public CuentaCorriente(float saldo) {
		super();
		this.saldo = saldo;
		limiteDescubierto=0;
	}
	
	public CuentaCorriente(String dni, float saldo, int limiteDescubierto) {
		super();
		this.dni = dni;
		this.saldo = saldo;
		this.limiteDescubierto = limiteDescubierto;
	}

	//ejercicio 6
	public CuentaCorriente(String nombre, String dni, float saldo, int limiteDescubierto, Banco banco) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
		this.limiteDescubierto = limiteDescubierto;
		this.banco = banco;
	}

	//ejercicio 6
	public CuentaCorriente(String nombre, String dni, float saldo, int limiteDescubierto) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
		this.limiteDescubierto = limiteDescubierto;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public void setLimiteDescubierto(int limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	//ejercicio 6
	public Banco getBanco() {
		return banco;
	}

	//ejercicio 6
	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	//métodos
	public boolean sacarDinero(int dineroASacar) {
		boolean haPodido=false;
		if (saldo-dineroASacar>=limiteDescubierto) {
			haPodido=true;
			this.saldo=this.saldo-dineroASacar;
			System.out.println("Ok.");
		}
		return haPodido;
	}
	
	public void ingresarDinero(int dineroAIngresar) {
		this.saldo+=dineroAIngresar;
	}
	
	//ejercicio 6 (cambiar de cuenta)
	public void cambiarBanco(Banco nuevoBanco) {
		this.banco=nuevoBanco;
		System.out.println("Se ha cambiado de banco exitosamente.");
	}
	
	public String toString() {
		return "Cuenta Corriente con nombre: "+nombre+
				", dni: "+dni+
				", saldo: "+saldo+
				", limite: "+limiteDescubierto+
				" y banco: "+banco+".";
	}
	
	//ejercicio 4 (lo comento por lo mismo de arriba)
	/*public static void cambiarNombre(String nombreNuevo) {
		nombreBanco=nombreNuevo;
	}*/
}