package menus;

public enum MenuComida {

    a("Pizza"), b("Sushi"), c("Hot Dog"), d("Empanadas"),
    e("Desserts"), f("Salad"), g("Salir"), z("Continue");
    private final String nombre;
    MenuComida(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
