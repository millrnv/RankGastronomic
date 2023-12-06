package modelo;

import java.util.ArrayList;
import java.util.List;

import menus.iniciarMenu;
public class RankGastronomic {

    private List<Restaurante> restaurantes;
    private List<Usuario> usuarios;
    private List<Reseña> reseñas;
    private List<Comida> comidas;

    public RankGastronomic(){
        this.restaurantes = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.reseñas = new ArrayList<>();
        this.comidas = new ArrayList<>();
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
    }

    public Restaurante filtrarRestaurante(String nombre) {
        for (Restaurante restaurante : this.restaurantes) {
            if (restaurante.getNombreRestaurante().equals(nombre)) {
                System.out.println("El restaurante: "+restaurante.getNombreRestaurante()+ "se encuentra en nuestra aplicacion");
                return restaurante;
            }
        }
        return null;
    }

    public double calcularDistanciaUsuarioRestaurante(Restaurante restaurante, Usuario usuario) {

        double radioTierra = 6371;
        double distanciaLat = Math.toRadians(restaurante.getLatitud() - usuario.getLatitud());
        double distanciaLng = Math.toRadians(restaurante.getLongitud() - usuario.getLongitud());
        double sindLat = Math.sin(distanciaLat / 2);
        double sindLng = Math.sin(distanciaLng / 2);
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)
                * Math.cos(Math.toRadians(usuario.getLatitud())) * Math.cos(Math.toRadians(restaurante.getLatitud()));
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
        return radioTierra * va2;
    }


    public boolean agregarUsuario(Usuario usuario) {
        if (!usuarioExiste(usuario)) {
            this.usuarios.add(usuario);
            return true;
        } else {
            return false;
        }
    }
    public boolean usuarioExiste(Usuario usuario){
        for(Usuario u : this.usuarios) {
            if(usuario.getNickName().equals(u.getNickName())) {
                return true;
            }
        }

        return false;
    }

    public boolean agregarRestaurante(Restaurante restaurante) {
        if (!restauranteExiste(restaurante)) {
            this.restaurantes.add(restaurante);
            return true;
        } else {
            return false;
        }
    }
    public boolean restauranteExiste(Restaurante restaurante) {
        for (Restaurante r : this.restaurantes) {
            if (restaurante.getNombreRestaurante().equals(r.getNombreRestaurante())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Restaurantes: " + restaurantes;
    }
}

