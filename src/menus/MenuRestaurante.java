package menus;

public enum MenuRestaurante {

    a("1"), b("2"), c("3"), d("4"),
    e("4"), f("5"), g("Salir"), z("Continue");
    private final String nombre;
    MenuRestaurante(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
}