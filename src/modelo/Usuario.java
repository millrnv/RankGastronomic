package modelo;

public class Usuario extends Ubicacion {
    private String nombreUsuario;
    private String nickName;
    private String contrasenia;
    private String correo;
    private Reseña reseña;


    public Usuario(String nombreUsuario, String nickName, String contrasenia, String correo, Reseña reseña, double latitud, double longitud){
        super(latitud, longitud);
        this.nombreUsuario = nombreUsuario;
        this.nickName = nickName;
        this.contrasenia = contrasenia;
        this.correo = correo;
        this.reseña = reseña;
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
    public void setReseña(Reseña reseña){
        this.reseña = reseña;
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
    public Reseña getReseña(){
        return reseña;
    }

    @Override
    public String toString(){
        return "Nombre de usuario: " + nombreUsuario + "\nNickname: " + nickName + "\nCorreo: " + correo;
    }

}
