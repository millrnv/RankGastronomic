package modelo;

public class Reseña {
    private String opinion;
    private int calificacion;

    public Reseña(String opinion, int calificacion){
        this.opinion = opinion;
        this.calificacion = calificacion;
    }

    public void setOpinion(String opinion){
        this.opinion = opinion;
    }

    public void setCalificacion(int calificacion){
        this.calificacion = calificacion;
    }

    public String getOpinion(){
        return opinion;
    }

    public int getCalificacion(){
        return calificacion;
    }

    @Override
    public String toString(){
        return "Opinion: " + opinion + "\nCalificacion: " + calificacion;
    }
}
