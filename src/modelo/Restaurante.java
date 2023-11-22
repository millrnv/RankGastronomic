package modelo;

import java.util.ArrayList;
import java.util.List;

public class Restaurante extends Ubicacion {
    private String nombreRestaurante;
    private List<Comida> comidas;

    public Restaurante(String nombreRestaurante, double latitud, double longitud){
        super(latitud, longitud);
        this.nombreRestaurante = nombreRestaurante;
        this.comidas = new ArrayList<>();
    }

    public void setNombreRestaurante(String nombreRestaurante){
        this.nombreRestaurante = nombreRestaurante;
    }
    public void setComidas(List<Comida> comidas){
        this.comidas = comidas;
    }
    public String getNombreRestaurante(){
        return nombreRestaurante;
    }
    public List<Comida> getComidas(){
        return comidas;
    }

    @Override
    public String toString(){
      return "Nombre del restaurante: " + nombreRestaurante + "\nComidas: " + comidas + "\nLatitud: " + latitud + "\nLongitud: " + longitud;

    }
}
