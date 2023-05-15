package poo3;
import java.util.Arrays;

public class MainMascota {

	public static void main(String[] args) {
		Mascota[] mascotas= {
				new Perro("Rufus", 7, Origen.Calle, true),
				new Perro("Peluson", 5, Origen.OtroDuenyo, false),
				new Gato("Misifus", 5, Origen.Tienda, 17),
				new Gato("Marramiau", 6, Origen.Asociacion, 20),
		};
		
		Arrays.sort(mascotas);
		System.out.println(Arrays.toString(mascotas));
		
		Arrays.sort(mascotas, new MascotasEdad());
		System.out.println(Arrays.toString(mascotas));
	}
}