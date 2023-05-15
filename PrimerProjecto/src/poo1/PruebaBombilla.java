package poo1;

public class PruebaBombilla {

	public static void main(String[] args) {
		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla();
		b1.encenderBombilla();
		System.out.println(b1.toString());
		Bombilla.fusiblesApagar();
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		Bombilla.fusiblesEncender();
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}