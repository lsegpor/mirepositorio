package tipoExamenPOO2021B;

import java.util.Arrays;
import java.util.Comparator;

public class Zoologico {
	private Mamifero tMamiferos[];
	private Veterinario tVeterinarios[];

	public Zoologico() {
		this.tVeterinarios = new Veterinario[0];
		this.tMamiferos = new Mamifero[0];
	}

	public Mamifero[] gettMamiferos() {
		return tMamiferos;
	}

	public Veterinario[] gettVeterinarios() {
		return tVeterinarios;
	}

	public void anyadeVeterinario(Veterinario veterinario) {
		Veterinario tNueva[] = new Veterinario[this.tVeterinarios.length + 1];
		for (int i = 0; i < this.tVeterinarios.length; i++)
			tNueva[i] = this.tVeterinarios[i];
		tNueva[this.tVeterinarios.length] = veterinario;
		this.tVeterinarios = tNueva;
	}

	public void anyadeMamifero(Mamifero mamifero) {
		Mamifero tNueva[] = new Mamifero[this.tMamiferos.length + 1];
		for (int i = 0; i < this.tMamiferos.length; i++)
			tNueva[i] = this.tMamiferos[i];
		tNueva[this.tMamiferos.length] = mamifero;
		this.tMamiferos = tNueva;
	}

	public Mamifero[] getMamiferosEntreFechas(Fecha inicio, Fecha fin) {
		Mamifero[] mamiferosNacidosEn = new Mamifero[0];
		for (int i = 0; i < tMamiferos.length; i++) {
			if (tMamiferos[i].getDiaNacimiento().compareTo(inicio) >= 0
					&& tMamiferos[i].getDiaNacimiento().compareTo(fin) <= 0) {
				mamiferosNacidosEn = Arrays.copyOf(mamiferosNacidosEn, mamiferosNacidosEn.length + 1);
				mamiferosNacidosEn[mamiferosNacidosEn.length - 1] = tMamiferos[i];
			}
		}
		return mamiferosNacidosEn;
	}

	public int getNVeterinariosMasDe(int minNumNacimientos) {
		int contadorVeterinariosMasNacimientos = 0;
		for (Veterinario v : tVeterinarios) {
			int contadorNacimientosV = 0;
			for (Mamifero m : tMamiferos) {
				if (m.getAsistente().equals(v)) {
					contadorNacimientosV++;
				}
			}
			if (contadorNacimientosV >= minNumNacimientos) {
				contadorVeterinariosMasNacimientos++;
			}
		}
		return contadorVeterinariosMasNacimientos;
	}

	public boolean veterinarioPadresEHijo() {

		for (Mamifero m : tMamiferos) { // Recorrer todos los mamíferos
			Mamifero padre = m.getPadre(); // Obtener el padre
			Mamifero madre = m.getMadre(); // Obtener la madre
			Veterinario v = m.getAsistente(); // Obtener el veterinario que asistió al nacimiento del hijo
			if (padre != null && madre != null && v != null) { // Si existen padre, madre y veterinario
				Fecha fechaNacimientoHijo = m.getDiaNacimiento(); // Obtener la fecha de nacimiento del hijo
				if (haAsistidoEnFecha(v, fechaNacimientoHijo) && haAsistidoEnFecha(v, padre.getDiaNacimiento())
						&& haAsistidoEnFecha(v, madre.getDiaNacimiento())) { // Verificar si el veterinario ha asistido
																				// a las tres fechas
					return true; // Si se cumple, devolver true
				}
			}
		}
		return false; // Si no se encontró ningún veterinario que cumpla la condición, devolver false
	}

	public boolean haAsistidoEnFecha(Veterinario veterinario, Fecha fecha) {
		for (Mamifero mamifero : tMamiferos) {
			if (mamifero.getDiaNacimiento().equals(fecha) && mamifero.getAsistente().equals(veterinario)) {
				return true;
			}
		}
		return false;
	}

	public boolean hayErroresEnFechas() {
		for (Mamifero m : tMamiferos) {
			Fecha fechaNacimiento = m.getDiaNacimiento();
			Fecha fechaNacimientoMadre = m.getMadre().getDiaNacimiento();
			Fecha fechaNacimientoPadre = m.getPadre().getDiaNacimiento();

			if (fechaNacimiento.compareTo(fechaNacimientoMadre) < 0
					|| fechaNacimiento.compareTo(fechaNacimientoPadre) < 0) {
				return true;
			}
		}
		return false;
	}

	public void ordenarMamiferos() {
		Arrays.sort(tMamiferos, new Comparator<Mamifero>() {
			@Override
			public int compare(Mamifero m1, Mamifero m2) {
				return -1 * (m1.nombre.compareTo(m2.nombre));
			}
		});
	}

}