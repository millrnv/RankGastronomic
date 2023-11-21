package modelo;

public class Restaurante {
    private String nombreRestaurante;
    private Comida comida;
    private double latitud;
    private double longitud;

    public Restaurante(String nombreRestaurante, Comida comida, double latitud, double longitud){
        this.nombreRestaurante = nombreRestaurante;
        this.comida = comida;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public void setNombreRestaurante(String nombreRestaurante){
        this.nombreRestaurante = nombreRestaurante;
    }

    public void setComida(Comida comida){
        this.comida = comida;
    }

    public String getNombreRestaurante(){
        return nombreRestaurante;
    }

    public Comida getComida(){
        return comida;
    }


    public double getLatitud(){
        return latitud;
    }

    public double getLongitud(){
        return longitud;
    }

    public double setLatitud(double latitud){
        return this.latitud = latitud;
    }

    public double setLongitud(double longitud){
        return this.longitud = longitud;
    }

    @Override
    public String toString(){
      return "Nombre del restaurante: " + nombreRestaurante + "\nComida: " + comida + "\nLatitud: " + latitud + "\nLongitud: " + longitud;

    }
}
