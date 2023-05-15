package poo1;

public class PruebaTexto {

	public static void main(String[] args) {
		Texto t1=new Texto(20);
		t1.añadir(true, "hola ");
		t1.añadir(false, "adios");
		System.out.println(t1.getCadena());
		System.out.println(t1.numVocales());
		System.out.println(t1.toString());
	}
}