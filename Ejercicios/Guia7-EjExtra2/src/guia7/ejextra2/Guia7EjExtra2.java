package guia7.ejextra2;

import entidades.Puntos;
import servicio.ServicioPuntos;

public class Guia7EjExtra2 {

    public static void main(String[] args) {

        ServicioPuntos sp = new servicio.ServicioPuntos();

        Puntos p1 = sp.crarPuntos();
        System.out.println("La distancia entre los puntos es: " + sp.puntosDistancia(p1));

    }

}
