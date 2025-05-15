package ar.edu.unq.po2.tp6SOLID;

import java.util.ArrayList;

public class Banco implements SolicitarCredito {
    private double capitalDelBanco;
	private ArrayList <Cliente> listaDeClientes = new ArrayList<Cliente>();
    private ArrayList <Credito> listaDeCreditosOtorgados = new ArrayList<Credito>();
    private ArrayList <Credito> listaDeSolicitudesDeCreditos = new ArrayList<Credito>();
    
        
    public Banco(double capitalDelBanco) {
		super();
		this.capitalDelBanco = capitalDelBanco;
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
    	this.setCapitalDelBanco(this.getCapitalDelBanco() - creditoOtorgado.getMontoSolicitado());
    	creditoOtorgado.getCliente().setSaldoCuenta(creditoOtorgado.getCliente().getSaldoCuenta()+ creditoOtorgado.getMontoSolicitado());
    }
    
    public void denegarCredito(Credito creditoDenegado) {
    	this.listaDeSolicitudesDeCreditos.remove(creditoDenegado);
    	this.informarAlClienteCreditoDenegado();
    }
    
    public String informarAlClienteCreditoDenegado() {
    	return "No cumple con los requisitos necesarios. Crédito denegado.";
    }
    
    
    
 
}
