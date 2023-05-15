package tipoExamenPOO2014;

public class Principal {

	public static void main(String[] args) {
		//a)
		Banco b= new Banco();
		System.out.println("Banco creado: "+b);
		Cliente c=new Cliente("11111111A", "Alejandra Lopez");
		System.out.println("A�ado cliente :"+b.addNuevoCliente(c));
		System.out.println("Banco con cliente c a�adido: "+b);
		
		//b)
		b.addCuentaCliente(c, 1);
		System.out.println("Banco con cuenta 1 a�adida al cliente: "+b);
		
		//c) 
		Movimiento m= new Movimiento(new Fecha(3, 3, 2003), 200);
		b.addMovACta(c, 1, m);
		System.out.println("Banco con movimiento a�adido a la cuenta 1 del cliente: "+b);
		
		//d)
		Movimiento m2= new Movimiento(new Fecha(2, 5, 2006), 100);
		b.addMovACta(c, 1, m2);

		System.out.println("Movimientos sin ordenar: "+b.getCuenta(1).getMovimientos());
		System.out.println("Movimientos ordenados" +b.getCuenta(1).getMovsOrdenados());
		
		//e)
		System.out.println(b.getCuenta(1).getMovs(new Fecha(3, 4, 2003), new Fecha(3, 6, 2007)));
	}

}