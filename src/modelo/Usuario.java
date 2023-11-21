package modelo;

public class Usuario {
    private String nombreUsuario;
    private String nickName;
    private String contrasenia;
    private String correo;
    private double latitud;
    private double longitud;


    public Usuario(String nombreUsuario, String nickName, String contrasenia, String correo, double latitud, double longitud){
      
        this.nombreUsuario = nombreUsuario;
        this.nickName = nickName;
        this.contrasenia = contrasenia;
        this.correo = correo;

        this.latitud = latitud;
        this.longitud = longitud;

    }

    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public void setContrasenia(String contrasenia){
        this.contrasenia = contrasenia;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }


    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public String getNickName(){
        return nickName;
    }

    public String getContrasenia(){
        return contrasenia;
    }

    public String getCorreo(){
        return correo;
    }

    public double getLatitud(){
        return latitud;
    }

    public double getLongitud(){
        return longitud;
    }

    public void setLatitud(double latitud){
        this.latitud = latitud;
    }

    public void setLongitud(double longitud){
        this.longitud = longitud;
    }

    @Override
    public String toString(){
        return "Nombre de usuario: " + nombreUsuario + "\nNickname: " + nickName + "\nCorreo: " + correo;
    }

}
