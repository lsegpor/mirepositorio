package poo2;

public class Campana extends Instrumento {
	public String sonido="tolon";
	public Campana(NotaMusical[] notas) {
		super(notas);
	}

	@Override
	public void interpretar() {
		for (int i=0; i<this.notas.length; i++) {
			System.out.println(notas[i]+" "+sonido);
		}

	}
}
