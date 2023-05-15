package poo3;
import java.util.Arrays;

public class MainCliente {

	public static void main(String[] args) {
		Cliente[] clientes= {
				new Cliente("46892514F", "Marta", 19, 1000),
				new Cliente("51423524T", "Pedro", 25, 1800),
				new Cliente("45698649S", "Jacinta", 37, 3000),
				new Cliente("34567897P", "Torcueto", 20, 1500),
		};
		
		Arrays.sort(clientes);
		System.out.println(Arrays.toString(clientes));
		
		Arrays.sort(clientes, new ClientesNombre());
		System.out.println(Arrays.toString(clientes));
		
		Arrays.sort(clientes, new ClientesEdad());
		System.out.println(Arrays.toString(clientes));
	}
}