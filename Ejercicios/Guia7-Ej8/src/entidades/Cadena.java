package entidades;

public class Cadena {

    private String frase;
    private int longitudfrase;

    public Cadena() {
    }

    public Cadena(String frase, int longitudfrase) {
        this.frase = frase;
        this.longitudfrase = longitudfrase;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitudfrase() {
        return longitudfrase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitudfrase(int longitudfrase) {
        this.longitudfrase = longitudfrase;
    }

  

    

}
