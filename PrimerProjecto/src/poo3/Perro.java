package poo3;

public class Perro extends Mascota {
	private boolean chip;
	
	public Perro() {
		super();
	}

	public Perro(String nombre, int edad, Origen origen, boolean chip) {
		super(nombre, edad, origen);
		setChip(chip);
	}

	public boolean isChip() {
		return chip;
	}

	public void setChip(boolean chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return super.toString()+", chip: "+chip;
	}
}
