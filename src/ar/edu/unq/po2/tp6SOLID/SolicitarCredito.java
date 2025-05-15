package ar.edu.unq.po2.tp6SOLID;

public interface SolicitarCredito {
    public void registrarSolicitudDeCredito(Credito creditoASolicitar);
    public void evaluarSolicitudDeCredito(Credito creditoASolicitar);
    public void otorgarCredito(Credito creditoAOtorgar);
    public void denegarCredito(Credito creditoADenegar);
}