package poo2;

public class MainHora {

	public static void main(String[] args) {
		//Ej 1
		Hora h1=new Hora(23, 59);
		System.out.println(h1.toString());
		h1.inc();
		System.out.println(h1.toString());
		
		//Ej 2
		Hora12 h2=new Hora12(12, 59, Meridiano.AM);
		System.out.println(h2.toString());
		h2.inc();
		System.out.println(h2.toString());
		
		//Ej 3
		HoraExacta h3=new HoraExacta(5, 26, 59);
		System.out.println(h3.toString());
		h3.inc();
		System.out.println(h3.toString());
		h3.setMinutos(59);
		h3.setSegundos(59);
		h3.inc();
		System.out.println(h3.toString());
		
		//Ej 4
		HoraExacta h4=new HoraExacta(5, 59, 59);
		System.out.println(h3.equals(h4));
		h4.inc();
		System.out.println(h3.equals(h4));
	}
}