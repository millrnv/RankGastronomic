package modelo;

import java.util.List;

public class RankGastronomic {

    private List<Restaurante> restaurantes;
    private List<Usuario> usuarios;
    private List<Reseña> reseñas;
    private List<Comida> comidas;

    public RankGastronomic(List<Restaurante> restaurantes, List<Usuario> usuarios, List<Reseña> reseñas, List<Comida> comidas){
        this.restaurantes = restaurantes;
        this.usuarios = usuarios;
        this.reseñas = reseñas;
        this.comidas = comidas;
    }

    public void setRestaurantes(List<Restaurante> restaurantes){
        this.restaurantes = restaurantes;
    }

    public void setUsuarios(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }

    public void setReseñas(List<Reseña> reseñas){
        this.reseñas = reseñas;
    }

    public void setComidas(List<Comida> comidas){
        this.comidas = comidas;
    }

    public List<Restaurante> getRestaurantes(){
        return restaurantes;
    }

    public List<Usuario> getUsuarios(){
        return usuarios;
    }

    public List<Reseña> getReseñas(){
        return reseñas;
    }

    public List<Comida> getComidas(){
        return comidas;
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

