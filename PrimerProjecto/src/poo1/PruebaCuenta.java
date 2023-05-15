package poo1;

public class PruebaCuenta {

	public static void main(String[] args) {
		//crear cuenta (y banco por ejercicio 6)
		Banco b1=new Banco("BBVA", "Madrid");
		Banco b2=new Banco("La Caixa", 2000000, "Sevilla");
		Banco b3=new Banco("Bankia", "Barcelona");
		CuentaCorriente c1=new CuentaCorriente("Juan", "45892314S", 2000, 0, b1);
		CuentaCorriente c2=new CuentaCorriente("Maria", "24527930V", 100, -10);
		CuentaCorriente c3=new CuentaCorriente(230);
		CuentaCorriente c4=new CuentaCorriente("12794636P", 500, -20);
		
		c3.setNombre("Pepe");
		c3.setDni("78963542T");
		c3.setBanco(b3);
		c4.setNombre("Paloma");
		c4.setBanco(b2);
		
		//sacar dinero
		if (c1.sacarDinero(160)) {
			System.out.println("Su nuevo saldo es "+c1.getSaldo()+".");
		} else {
			System.out.println("Dinero insuficiente.");
		}
		
		//ingresar dinero
		c2.ingresarDinero(200);
		
		//cambiar de banco
		c4.cambiarBanco(b3);
		
		//mostrar información
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c4.toString());
		
		//prueba ej 4 (lo comento porque blabla ejercicio 6)
		/*System.out.println(CuentaCorriente.nombreBanco);
		CuentaCorriente.cambiarNombre("La Caixa");
		System.out.println(CuentaCorriente.nombreBanco);*/
	}
}