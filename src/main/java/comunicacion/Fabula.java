package comunicacion;

public class Fabula extends Escrito{

    private String enseñanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion){
        super(origentitulo,autor,paginas);
        this.enseñanza = enseñanza;
        this.interpretacion = interpretacion;
    }

    public String getEnseanza(){
        retunr this.enseñanza
    }

    public void setEnseñanza(String enseñanza){
        this.enseñanza = enseñanza;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas() * 1;
    }

    public String toString(){
        return String.format("%s\n%s\n%s\n%d\n%s",this.getOrigen(),this.getTitulo(),this.getAutor(),this.getPaginas(),this.getEnseñanza());

    }


}