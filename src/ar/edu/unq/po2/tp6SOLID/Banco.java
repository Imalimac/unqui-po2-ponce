package ar.edu.unq.po2.tp6SOLID;

import java.util.ArrayList;

public class Banco implements SolicitarCredito {
    private double capitalDelBanco;
    private ClienteEMail emailBanco;
	private ArrayList <Cliente> listaDeClientes = new ArrayList<Cliente>();
    private ArrayList <Credito> listaDeCreditosOtorgados = new ArrayList<Credito>();
    private ArrayList <Credito> listaDeSolicitudesDeCreditos = new ArrayList<Credito>();
    
        
    public Banco(double capitalDelBanco, ClienteEMail emailBanco) {
		super();
		this.capitalDelBanco = capitalDelBanco;
		this.emailBanco = emailBanco;
	}
  
	public double getCapitalDelBanco() {
		return capitalDelBanco;
	}

	public void setCapitalDelBanco(double capitalDelBanco) {
		this.capitalDelBanco = capitalDelBanco;
	}

	public void agregarCliente(Cliente cliente){
        listaDeClientes.add(cliente);
    }
        
    public ArrayList<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public void agregarCreditoOtorgado(Credito credito) {
		this.listaDeCreditosOtorgados.add(credito);
	}
	
	public ArrayList<Credito> getListaDeCreditosOtorgados() {
		return listaDeCreditosOtorgados;
	}


	public void registrarSolicitudDeCredito(Credito creditoASolicitar) {
    	this.listaDeSolicitudesDeCreditos.add(creditoASolicitar);
    }

	public ArrayList<Credito> getListaDeSolicitudesDeCreditos() {
		return listaDeSolicitudesDeCreditos;
	}

	public void evaluarTodasLasSolicitudesPendientes(ArrayList<Credito> listaDeSolicitudesPendientes) {
		ArrayList<Credito> listaDeSolicitudesARecorrer = new ArrayList<Credito>();
				
		for (Credito credito:listaDeSolicitudesPendientes) {
			listaDeSolicitudesARecorrer.add(credito);
		} // Lista auxiliar, dado que al denegar u otorgar los creditos se eliminan de la lista de pendientes.

		for (Credito credito:listaDeSolicitudesARecorrer) {
			this.evaluarSolicitudDeCredito(credito);
		}
		
	}
	
	public double montoTotalDeCreditosADesembolsar(ArrayList<Credito> listaDeSolicitudesPendientes) {
		double montoTotalADesembolsar = 0;
				
		for (Credito credito:listaDeSolicitudesPendientes) {
			if (credito.esAceptable()) {
				montoTotalADesembolsar = montoTotalADesembolsar + credito.getMontoSolicitado();
			}
		}
		
		return montoTotalADesembolsar;
	}
	
	public void acreditarDineroDeCredito(Credito creditoAOtorgar) {
		if (this.getCapitalDelBanco()>= creditoAOtorgar.getMontoSolicitado()) {
			this.setCapitalDelBanco(this.getCapitalDelBanco() - creditoAOtorgar.getMontoSolicitado());
			creditoAOtorgar.getCliente().setSaldoCuenta(creditoAOtorgar.getCliente().getSaldoCuenta()+ creditoAOtorgar.getMontoSolicitado());
		}
	}
	
    public void evaluarSolicitudDeCredito(Credito creditoSolicitado) {
    	if (creditoSolicitado.esAceptable()) {
    		this.otorgarCredito(creditoSolicitado);
    		} 
    	else {
    		this.denegarCredito(creditoSolicitado);
    	}
    	
    }
   
    public void otorgarCredito(Credito creditoOtorgado) {
    	this.agregarCliente(creditoOtorgado.getCliente());
    	this.agregarCreditoOtorgado(creditoOtorgado);
    	this.listaDeSolicitudesDeCreditos.remove(creditoOtorgado);
    	this.acreditarDineroDeCredito(creditoOtorgado);
	
    }
    
    public void denegarCredito(Credito creditoDenegado) {
    	this.listaDeSolicitudesDeCreditos.remove(creditoDenegado);
    	this.enviarEMailAlClienteDeCreditoDenegado(creditoDenegado);
    }
    
	public Correo correoDeCreditoDenegado(String destinatario) {	
		return 	new Correo(this.asuntoMailDenegacionDeCredito(), destinatario, this.cuerpoMailDenegacionDeCredito());
			
	}
	
	public String asuntoMailDenegacionDeCredito() {
		return "Denegacion De Credito";
	}

	public String cuerpoMailDenegacionDeCredito() {
		return "Su crédito ha sido Denegado.";
	}

    public void enviarEMailAlClienteDeCreditoDenegado(Credito creditoDenegado) {
    	emailBanco.enviarCorreo(this.asuntoMailDenegacionDeCredito(), creditoDenegado.getCliente().getEmail().getNombreUsuario(), this.cuerpoMailDenegacionDeCredito());
    }
    
    
    
 
}
