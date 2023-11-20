package modelo;

public class Usuario {
    private String nombreUsuario;
    private String nickName;
    private String contrasenia;
    private String correo;

    public Usuario(String nombreUsuario, String nickName, String contrasenia, String correo){
        this.nombreUsuario = nombreUsuario;
        this.nickName = nickName;
        this.contrasenia = contrasenia;
        this.correo = correo;
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

    @Override
    public String toString(){
        return "Nombre de usuario: " + nombreUsuario + "\nNickname: " + nickName + "\nContrasenia: " + contrasenia + "\nCorreo: " + correo;
    }
}
