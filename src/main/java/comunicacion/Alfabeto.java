package comunicacion;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;

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
        return "a, b, c, d, e, f, g, h, i, j, k, l, m, n, ñ, o, p, q, r, s, t, u, v, w, x, y, z"

    }

    public int cantidadLetras(){
        return this.letras.size();
    }
}