package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia ,String interpretacion){
        super(origen,titulo,autor,paginas);
        this.fecha = fecha;
        this.primicia =primicia;
        this.interpretacion = interpretacion;
    }

    public String getFecha(){
        return this.fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getPrimicia(){
        return this.primicia;
    }

    public void setPrimicia(String primicia){
        this.primicia = primicia;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int palabrasPagina){
        return 10 * this.getPaginas() * palabrasPagina;
    }

    public String toString(){
        return (this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+ this.getPaginas()+"\n"+this.getFecha()+"\n"+this.getPrimicia());
    }
}