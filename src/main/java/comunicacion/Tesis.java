package  comunicacion;

import java.util.ArrayList;

public class Tesis extends  Escrito{

    private String idea;
    private String[] argumentos = new String[0];
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas,String idea,String[] argumentos,
                 String conclusion, String referencias, String interpretacion ){
        super(origen,titulo,autor,paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String getIdea(){
        return this.idea;
    }

    public void setIdea(String idea){
        this.idea = idea;
    }

    public String[] getArgumentos(){
        return this.argumentos;
    }

    public void setArgumentos(String[] argumentos){
        this.argumentos = argumentos;
    }

    public String getConclusion(){
        return this.conclusion;
    }

    public void setConclusion(String conclusion){
        this.conclusion =conclusion;
    }

    public String getReferencias(){
        return this.referencias;
    }

    public void setReferencias(String referencias){
        this.referencias = referencias;
    }

    public String interpretacion(){
        return this.interpretacion;

    }

    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }
    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas() *5;

    }


    public String toString(){
        return String.format("%s\n%s\n%s\n%d\n%s\n%d\n%s\n%s",this.getOrigen(),this.getTitulo(),this.getAutor(),this.getPaginas(),this.idea,this.argumentos.length,this.conclusion,this.referencias);
    }
}