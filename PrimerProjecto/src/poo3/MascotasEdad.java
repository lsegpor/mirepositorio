package poo3;
import java.util.Comparator;

public class MascotasEdad implements Comparator<Mascota> {

	@Override
	public int compare(Mascota o1, Mascota o2) {
		return o2.getEdad()-o1.getEdad();
	}

}
