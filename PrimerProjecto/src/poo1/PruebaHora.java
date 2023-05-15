package poo1;

public class PruebaHora {

	public static void main(String[] args) {
		Hora h1=new Hora(4, 20, 31);
		h1.addSegundos(12196);
		System.out.println(h1.toString());
	}
}