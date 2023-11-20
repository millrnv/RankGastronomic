package modelo;

import java.util.List;

public class RankGastronomic {

    private List<Restaurante> restaurantes;

    public RankGastronomic(List<Restaurante> restaurantes){
        this.restaurantes = restaurantes;
    }

    public void setRestaurantes(List<Restaurante> restaurantes){
        this.restaurantes = restaurantes;
    }

    public List<Restaurante> getRestaurantes(){
        return restaurantes;
    }

    public void generarMenu() {
        // TODO - implement modelo.RankGastronomic.generarMenu
        throw new UnsupportedOperationException();
    }

    public List<Restaurante> filtrarRestaurante() {
        // TODO - implement modelo.RankGastronomic.filtrarRestaurante
        throw new UnsupportedOperationException();
    }

    public double calcularDistanciaUsuarioRestaurante() {
        // TODO - implement modelo.RankGastronomic.calcularDistanciaUsuarioRestaurante
        throw new UnsupportedOperationException();
    }

    public void agregarUsuario() {
        // TODO - implement modelo.RankGastronomic.agregarUsuario
        throw new UnsupportedOperationException();
    }

    public void agregarRestaurante() {
        // TODO - implement modelo.RankGastronomic.agregarRestaurante
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString(){
        return "Restaurantes: " + restaurantes;
    }
}
