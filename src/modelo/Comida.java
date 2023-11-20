package modelo;

public class Comida {
    private String nombre;
    private double precio;

    public Comida (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
}
