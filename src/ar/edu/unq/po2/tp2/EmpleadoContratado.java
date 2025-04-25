package ar.edu.unq.po2.tp2;

public class EmpleadoContratado extends Empleado {
	private int numeroDeContrato;
	private String medioDePago;
	
		public EmpleadoContratado(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento,
			float sueldoBasico, int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago = medioDePago;
		}

		public String getMedioDePago() {
			return medioDePago;
		}

		public void setMedioDePago(String medioDePago) {
			this.medioDePago = medioDePago;
		}

		public int getNumeroDeContrato() {
			return numeroDeContrato;
		}
	
		@Override
		public float sueldoBruto() {
			return this.getSueldoBasico();
		}

		@Override
		public float obraSocial() {
			return 0;
		}

		@Override
		public float aportesJubilatorios() {
			return 0;
		}
		
		@Override
		public float retenciones() {
			return 50;
		}
		
}

