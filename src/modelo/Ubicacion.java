package modelo;

public abstract class Ubicacion {
    protected double latitud;
    protected double longitud;


    public double getLatitud() {
        return latitud;
    }
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Ubicacion(double latitud, double longitud){
        this.latitud = latitud;
        this.longitud = longitud;
    }
}
