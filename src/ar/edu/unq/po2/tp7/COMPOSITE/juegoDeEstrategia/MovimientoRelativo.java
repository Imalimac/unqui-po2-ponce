package ar.edu.unq.po2.tp7.COMPOSITE.juegoDeEstrategia;

public class MovimientoRelativo {
    public static double[] moverRelativo(double lat, double lon, double deltaLat, double deltaLon) {
        return new double[]{lat + deltaLat, lon + deltaLon};
    }

    public static void main(String[] args) {
        double latActual = -34.6037; // Buenos Aires
        double lonActual = -58.3816;

        double[] nuevaUbicacion = moverRelativo(latActual, lonActual, 0.1, -0.2); // Mover 0.1° norte y 0.2° oeste

        System.out.println("Nueva ubicación: Lat " + nuevaUbicacion[0] + ", Lon " + nuevaUbicacion[1]);
    }
}