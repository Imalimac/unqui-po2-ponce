package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmpleadoTemporal extends Empleado{
	private final LocalDate fechaDeFinDeDesignacion;
	private float horasExtra;
	private int añosDeAportes;
	
	public EmpleadoTemporal(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento,
			float sueldoBasico, String fechaDeFinDeDesignacion, int añosDeAportes) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		DateTimeFormatter formateadorDeFechaDeNacimiento = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.fechaDeFinDeDesignacion = LocalDate.parse(fechaDeFinDeDesignacion, formateadorDeFechaDeNacimiento);
		this.horasExtra = 0;
		this.añosDeAportes = añosDeAportes;
		
	}
	
	public int getAñosDeAportes() {
		return añosDeAportes;
	}

	public void setAñosDeAportes(int añosDeAportes) {
		this.añosDeAportes = añosDeAportes;
	}

	public float getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(float horasExtra) {
		this.horasExtra = horasExtra;
	}

	public LocalDate getFechaDeFinDeDesignacion() {
		return fechaDeFinDeDesignacion;
	}
	@Override
	public String desgloceDeConceptos() {
		return ("Sueldo Bruto: " + this.sueldoBruto() + 
				"Sueldo Básico: " + " " + this.getSueldoBasico() +  
				"Retenciones: " + this.retenciones() + 
				"Obra Social: " + this.obraSocial()+
				"Aportes Jubilatorios: " + this.aportesJubilatorios()).toString();
	}

	@Override
	public float sueldoBruto() {
		return this.getSueldoBasico() + (this.getHorasExtra()*40);
	}

	@Override
	public float obraSocial() {
		return (float) (0.10 * this.sueldoBruto() + this.extraPorAñosDeAportes());
	}

	@Override
	public float aportesJubilatorios() {
		return (float) (0.10 * this.sueldoBruto()+ this.getHorasExtra()*5);
	}
	
	public float extraPorAñosDeAportes() {
		if (this.añosDeAportes >50) {return 25;}else {return 0;}
	}
	
}
