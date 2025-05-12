package ar.edu.unq.po2.tp5INTERFACES;

import java.util.ArrayList;

public class AgenciaRecaudadora {
	public ArrayList<Factura> facturasPagas = new ArrayList<Factura>();
	
	public void notificarPagoDeFactura(Factura facturaPaga) {
		this.facturasPagas.add(facturaPaga);
	}

	public ArrayList<Factura> getFacturasPagas() {
		return facturasPagas;
	}
	
	

}
