package modelo;

public class Restaurante {
    private String nombreRestaurante;
    private Comida comida;

    public Restaurante(String nombreRestaurante, Comida comida){
        this.nombreRestaurante = nombreRestaurante;
        this.comida = comida;
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

}
