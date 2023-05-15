package poo1;

public class PruebaPersona {

	public static void main(String[] args) {
		Persona p=new Persona();
		Persona.setHoy(Dia.LUNES);
		
		System.out.println(p);
	}
}