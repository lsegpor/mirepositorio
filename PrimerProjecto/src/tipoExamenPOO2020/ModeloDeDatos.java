package tipoExamenPOO2020;

public class ModeloDeDatos {

	Articulo tArticulos[];
	Cliente tClientes[];
	Factura tFacturas[];

	public ModeloDeDatos() {
		this.tArticulos = new Articulo[0];
		this.tClientes = new Cliente[0];
		this.tFacturas = new Factura[0];
	}

	public void anyadeArticulo(Articulo articuloNuevo) {
		Articulo nuevaTArticulos[] = new Articulo[this.tArticulos.length + 1];
		for (int i = 0; i < this.tArticulos.length; i++)
			nuevaTArticulos[i] = tArticulos[i];

		nuevaTArticulos[this.tArticulos.length] = articuloNuevo;
		this.tArticulos = nuevaTArticulos;
	}

	public void anyadeFactura(Factura FacturaNueva) {
		Factura nuevaTFacturas[] = new Factura[this.tFacturas.length + 1];
		for (int i = 0; i < this.tFacturas.length; i++)
			nuevaTFacturas[i] = tFacturas[i];

		nuevaTFacturas[this.tFacturas.length] = FacturaNueva;
		this.tFacturas = nuevaTFacturas;
	}

	public void anyadeCliente(Cliente clienteNuevo) {
		Cliente nuevaTClientes[] = new Cliente[this.tClientes.length + 1];
		for (int i = 0; i < this.tClientes.length; i++)
			nuevaTClientes[i] = tClientes[i];

		nuevaTClientes[this.tClientes.length] = clienteNuevo;
		this.tClientes = nuevaTClientes;
	}

	public Factura facturaFusionada(Cliente cliente, int numFra) {
		Factura fusionada = new Factura(numFra, cliente, 0.0F);
		
		for (Factura f:this.tFacturas) {
			if (f.getCliente().equals(cliente)) {
				for (Linea l:f.gettLineas()) {
					fusionada.anyadeLinea(l);
				}
			}
		}
		return fusionada ;
	}

	public Factura facturaFusionadaResumida(Cliente cliente, int numFra) {
		Factura fusionada = new Factura(numFra, cliente, 0.0F);
		for (Factura f:this.tFacturas) {
			if (f.getCliente().equals(cliente)) {
				for (Linea lInsertar:f.gettLineas()) {
					boolean esta = false;
					for (Linea lExistente:fusionada.gettLineas()) {
						if (lExistente.getArticulo().equals(lInsertar.getArticulo())) {
							lExistente.setCantidad(lExistente.getCantidad()+lInsertar.getCantidad());
							esta = true;
						}
					}
					if (!esta) {
						fusionada.anyadeLinea(new Linea(lInsertar.getArticulo(), lInsertar.getCantidad()));
					}
				}
			}
		}
		return fusionada;
	}

	public float gastoPorCliente(Cliente cliente) {
		float gastoCliente = 0.0F;
		for (Factura f:this.tFacturas) {
			if (cliente.equals(f.getCliente())) {
				gastoCliente+=f.getImporteTotalFra();
			}
		}
		return gastoCliente;
	}

	public Cliente clienteMayorGasto() {
		Cliente cliente = this.tClientes[0];
		for (Cliente c:this.tClientes) {
			if (gastoPorCliente(c) > gastoPorCliente(cliente)) {
				cliente = c;
			}
		}
		return cliente;
	}

	public Articulo[] articulosPorVentas() {
		Articulo tArtDevolver[] = new Articulo[this.tArticulos.length];
		int nElem = 0;
		for (Articulo a:this.tArticulos) {
			int pos = nElem-1;
			while (pos >= 0 && totalUnidadesVendidas(a) > totalUnidadesVendidas(tArtDevolver[pos])) {
				tArtDevolver[pos+1] = tArtDevolver[pos];
				pos--;
			}
			tArtDevolver[pos+1] = a;
			nElem++;
		}
		return tArtDevolver;
	}

	public int totalUnidadesVendidas(Articulo articulo) {
		int totalUnidades = 0;
		for (Factura f:this.tFacturas) {
			for (Linea l:f.gettLineas()) {
				if (l.getArticulo().equals(articulo)) {
					totalUnidades += l.getCantidad();
				}
			}
		}
		return totalUnidades;
	}

}