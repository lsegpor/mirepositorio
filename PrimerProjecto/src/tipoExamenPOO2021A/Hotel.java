package tipoExamenPOO2021A;

public class Hotel {
	private Reserva tReservas[];
	private Cliente tClientes[];
	private Habitacion tHabitaciones[];

	public Hotel() {
		this.tClientes = new Cliente[0];
		this.tHabitaciones = new Habitacion[0];
		this.tReservas = new Reserva[0];
	}

	public void anyadeCliente(Cliente cliente) {
		Cliente tNueva[] = new Cliente[this.tClientes.length + 1];
		for (int i = 0; i < this.tClientes.length; i++)
			tNueva[i] = this.tClientes[i];
		tNueva[this.tClientes.length] = cliente;
		this.tClientes = tNueva;
	}

	public void anyadeHabitacion(Habitacion habitacion) {
		Habitacion tNueva[] = new Habitacion[this.tHabitaciones.length + 1];
		for (int i = 0; i < this.tHabitaciones.length; i++)
			tNueva[i] = this.tHabitaciones[i];
		tNueva[this.tHabitaciones.length] = habitacion;
		this.tHabitaciones = tNueva;
	}

	public void anyadeReserva(Reserva reserva) {
		Reserva tNueva[] = new Reserva[this.tReservas.length + 1];
		for (int i = 0; i < this.tReservas.length; i++)
			tNueva[i] = this.tReservas[i];
		tNueva[this.tReservas.length] = reserva;
		this.tReservas = tNueva;
	}

	public Reserva[] getReservasDeHabitacion(Habitacion habitacion) {
		Hotel otro = new Hotel();
		for (Reserva r:this.tReservas) {
			if (r.getHabitacion().getNumero() == habitacion.getNumero()) {
				otro.anyadeReserva(r);
			}
		}
		return otro.tReservas;
	}

	public Habitacion[] habitacionesOcupadasElDia(Fecha fecha) {
		Hotel otro = new Hotel();
		for (Reserva r:this.tReservas) {
			if (r.getFechaInicio().compareTo(fecha) <= 0 && r.getFechaFin().compareTo(fecha) >= 0) {
				otro.anyadeHabitacion(r.getHabitacion());
			}
		}
		return otro.tHabitaciones;
	}

	public boolean habitacionDisponible(Habitacion habitacion, Fecha inicio, Fecha fin) {
		for (Reserva r:this.getReservasDeHabitacion(habitacion)) {
			if (r.getFechaFin().compareTo(inicio) >= 0 && fin.compareTo(r.getFechaInicio()) >=0) {
				return false;
			}
		}
		return true;
	}

	public boolean hayErroresEnReservas() {
		for (Habitacion h:this.tHabitaciones) {
			for (Reserva r:this.getReservasDeHabitacion(h)) {
				for (Reserva s:this.getReservasDeHabitacion(h)) {
					if (!r.getCliente().getNombre().equals(s.getCliente().getNombre()) &&
					r.getFechaFin().compareTo(s.getFechaInicio()) >= 0 &&
					s.getFechaFin().compareTo(r.getFechaInicio()) >= 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

}