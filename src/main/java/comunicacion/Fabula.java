package comunicacion;

public class Fabula extends Escrito{

    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origentitulo,autor,paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String getEnseanza(){
        return this.ensenanza;
    }

    public void setEnsenanza(String ensenanza){
        this.ensenanza = ensenanza;
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
        return String.format("%s\n%s\n%s\n%d\n%s",this.getOrigen(),this.getTitulo(),this.getAutor(),this.getPaginas(),this.getEnsenanza());

    }


}