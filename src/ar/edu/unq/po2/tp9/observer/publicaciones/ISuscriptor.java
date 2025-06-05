package ar.edu.unq.po2.tp9.observer.publicaciones;

//Observador Abstracto
public interface ISuscriptor {
    void actualizar(String novedad);
    void suscribirse(Notificaciones notificador, String suscripcion);
}
