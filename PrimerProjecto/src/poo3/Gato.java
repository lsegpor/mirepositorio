package poo3;

public class Gato extends Mascota {
	private int pelosBigote;

	public Gato() {
		super();
	}

	public Gato(String nombre, int edad, Origen origen, int pelosBigote) {
		super(nombre, edad, origen);
		setPelosBigote(pelosBigote);
	}

	public int getPelosBigote() {
		return pelosBigote;
	}

	public void setPelosBigote(int pelosBigote) {
		this.pelosBigote = pelosBigote;
	}

	@Override
	public String toString() {
		return super.toString()+", pelosBigote: "+pelosBigote;
	}
}
