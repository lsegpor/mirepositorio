package poo2;
import java.util.Arrays;

public abstract class Instrumento {
	protected NotaMusical[] notas= new NotaMusical[100];

	public Instrumento() {
		super();
	}

	public Instrumento(NotaMusical[] notas) {
		super();
		setNotas(notas);
	}

	public NotaMusical[] getNotas() {
		return notas;
	}

	public void setNotas(NotaMusical[] notas) {
		this.notas = notas;
	}
	
	public void add(NotaMusical notas) {
		for (int i = 0; i < this.notas.length; i++) {
			if (this.notas[i] == null) {
				this.notas[i] = notas;
			}
		}
	}
	
	public abstract  void interpretar();

	@Override
	public String toString() {
		return "Instrumento --> Notas: "+Arrays.toString(notas);
	}
}
