package comunicacion;

public class Alfabeto extends Pictograma{

    private String[] letras ;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = new String[letras.length];
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras(){
        return this.letras;
    }

    public void setLetras(String[] letras){
        this.letras = letras;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion){
        this.interpretacion = interpretacion;
    }

    public  String toString(){
        String cadena =(this.letras[0]+"");
        for (String letra: this.letras){
            if letra == letras[0]{
                continue
            }else{
                cadena+=(", "+ letra);
            }
            return cadena;
        }

    }

    public int cantidadLetras(){
        return this.letras.length;
    }
}
