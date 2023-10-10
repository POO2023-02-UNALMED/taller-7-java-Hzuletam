package comunicacion;

public class Periodico extends Escrito{
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
        return this.paginas * 10;
    }

    public String toString(){
        return String.format("%s\n%s\n%s\n%d\n%s\n%s",this.origen,this.titulo,this.autor,this.paginas,this.fecha,this.primicia);
    }
}