package poo2;

public class MainCaja {

	public static void main(String[] args) {
		//Ej 7
		Caja c1=new Caja(15, 20, 20, Unidades.CM);
		System.out.println(c1.toString());
		//Ej 8
		CajaCarton c2=new CajaCarton(2, 1, 3, Unidades.M);
		System.out.println(c2.toString());
	}
}