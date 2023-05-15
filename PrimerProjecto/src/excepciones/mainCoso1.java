package excepciones;

public class mainCoso1 {

	public static void main(String[] args) {
		Integer[] array1 = {1, 2, 3};
		Integer[] array2 = {null};

	    try {
	        System.out.println(findIndex(array1, 2));
	        System.out.println(findIndex(array1, 4));
	        System.out.println(findIndex(array2, 0));
	    } catch (NullPointerException e) {
	        System.out.println("El array contiene nulos.");
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("Se intento acceder a una posicion que no existe.");
	    }
	}
	
	public static int findIndex(Integer[] array, int posicion) throws NullPointerException, ArrayIndexOutOfBoundsException {
		return array[posicion].intValue();
	}

}
