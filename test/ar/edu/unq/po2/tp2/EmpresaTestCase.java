package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//import java.util.ArrayList;

class EmpresaTestCase {

		public EmpleadoTemporal carlosTemporal = new EmpleadoTemporal("Carlos Temporal", "Solis 110", "Soltero", "1988-12-02", 1000, "2026-12-25", 20);
		public EmpleadoPermanente juanPermanente = new EmpleadoPermanente("Juan Permanente", "Libertad 225" , "casado", "1992-11-02",
				2000, 3, "2017-12-02");
		public EmpleadoContratado joseContratado = new EmpleadoContratado("Jose Contratado", "Alem 333", "soltero", "1984-11-02",
				1100, 22, "Transferencia");
		public Empresa laEmpresa = new Empresa();

		
		@Test
		void testEmpresa() {
			laEmpresa.setNombre("Nombre de la Empresa");
			laEmpresa.setCuit(11256);
			laEmpresa.contratar(carlosTemporal);
			laEmpresa.contratar(juanPermanente);
			laEmpresa.contratar(joseContratado);
			
			assertEquals(this.laEmpresa.getNombre(), "Nombre de la Empresa");
			assertEquals(this.laEmpresa.getCuit(), 11256);
			assertEquals(3,this.laEmpresa.getEmpleados().size());
			assertEquals(carlosTemporal, this.laEmpresa.getEmpleados().get(0));
			assertEquals(juanPermanente, this.laEmpresa.getEmpleados().get(1));
			assertEquals(joseContratado, this.laEmpresa.getEmpleados().get(2));
		
		
		/*Cálculo del total de sueldos neto.*/
			assertEquals(this.laEmpresa.montoTotalNeto(), 4002.5);
		
		/*Liquidación de sueldo.*/
			laEmpresa.liquidarSueldos();
			assertEquals(3, this.laEmpresa.getRecibosDeHaberes().size());
			assertEquals(this.laEmpresa.getRecibosDeHaberes().get(0).getEmpleado(), carlosTemporal);
		}
}