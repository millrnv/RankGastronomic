package modelo;

import java.util.ArrayList;
import java.util.List;

public class Restaurante extends Ubicacion {
    private String nombreRestaurante;
    private List<Comida> comidas;

    private String direccion;

    public Restaurante(String nombreRestaurante, double latitud, double longitud, String direccion){
        super(latitud, longitud);
        this.nombreRestaurante = nombreRestaurante;
        this.comidas = new ArrayList<>();
        this.direccion = direccion;
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
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }

    public boolean agregarComida(Comida comida){
        if(!comidaExiste(comida)) {
            this.comidas.add(comida);
            return true;
        } else {
            return false;
        }
    }
    public boolean comidaExiste(Comida comida){
        for(Comida c : this.comidas) {
            if(comida.getNombre().equals(c.getNombre())) {
                return true;
            }
        }

        return false;
    }
    @Override
    public String toString(){
      return "Nombre del restaurante: " + nombreRestaurante + "\nComidas: " + comidas + "\nLatitud: " + latitud + "\nLongitud: " + longitud;

    }
}
