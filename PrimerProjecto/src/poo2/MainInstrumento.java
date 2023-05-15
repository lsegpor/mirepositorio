package poo2;

public class MainInstrumento {

	public static void main(String[] args) {
		//Ej 5-6
		Piano n1= new Piano(new NotaMusical[]{NotaMusical.SI,NotaMusical.LA, NotaMusical.SOL});
		n1.interpretar();
		//Ej 5-6
		Campana n2= new Campana(new NotaMusical[]{NotaMusical.DO,NotaMusical.RE, NotaMusical.MI});
		n2.interpretar();
	}
}