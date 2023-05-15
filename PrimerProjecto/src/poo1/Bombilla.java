package poo1;

public class Bombilla {
	//atributos
	private boolean bombillaEncendida=false;
	private static boolean fusibleEncendido=true;
	
	//constructores
	public Bombilla() {
		super();
	}
	
	public Bombilla(boolean bombillaencendida) {
		super();
		bombillaEncendida = bombillaencendida;
	}

	//getters y setters
	public boolean isBombillaencendida() {
		if (fusibleEncendido==false) {
			return false;
		} else {
			return bombillaEncendida;
		}
	}

	public static boolean isFusibleEncendido() {
		return fusibleEncendido;
	}

	//métodos
	public String toString() {
		return "Bombilla encendida: "+isBombillaencendida()+".";
	}
	
	public void encenderBombilla() {
		bombillaEncendida=true;
	}
	
	public void apagarBombilla() {
		bombillaEncendida=false;
	}
	
	static void fusiblesApagar() {
		fusibleEncendido=false;
	}
	
	static void fusiblesEncender() {
		fusibleEncendido=true;
	}
}
