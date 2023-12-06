package test;

import modelo.Comida;
import modelo.RankGastronomic;
import modelo.Restaurante;
import modelo.Usuario;

import java.awt.*;

public class prueba {
    public static void main(String[] args) {
        Iniciar();
    }
    public static void Iniciar(){
        Comida sushi =  new Comida("Sushi", 1300);
        Comida pizza = new Comida("Pizza", 2000);
        Usuario usuario1 = new Usuario("jorge", "coke", "123123", "jorge@gmail.com", 1850.6, 78563.8);
        Restaurante restaurante1 = new Restaurante("Restaurante", 82213.8, 181233.7,"Los Pablos");
        RankGastronomic rankGastronomic = new RankGastronomic();
        rankGastronomic.agregarRestaurante(restaurante1);
        rankGastronomic.agregarUsuario(usuario1);
        restaurante1.agregarComida(sushi);
        restaurante1.agregarComida(pizza);
        System.out.println(usuario1.toString());
        System.out.println(restaurante1.toString());
        System.out.println("La distancia entre usuario y restaurante es de: "+rankGastronomic.calcularDistanciaUsuarioRestaurante(restaurante1,usuario1));
        rankGastronomic.filtrarRestaurante("Restaurante");
    }
}
