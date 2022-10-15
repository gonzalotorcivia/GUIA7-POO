package servicio;

import entidades.Cadena;
import java.util.Scanner;

public class ServicioCadena {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int contador = 0;

    public int mostrarVocales(Cadena f1) {

        String frase = f1.getFrase();

        int contadorVocales;

        contadorVocales = 0;

        for (int i = 0; i < f1.getLongitudfrase(); i++) {

            if (("a").equalsIgnoreCase(frase.substring(i, i + 1)) || ("e").equalsIgnoreCase(frase.substring(i, i + 1)) || ("i").equalsIgnoreCase(frase.substring(i, i + 1))
                    || ("o").equalsIgnoreCase(frase.substring(i, i + 1)) || ("u").equalsIgnoreCase(frase.substring(i, i + 1))) {

                contadorVocales++;

            }

        }

        return contadorVocales;
    }

    public void invertirFrase(Cadena fra) {

        String fraseoriginal = fra.getFrase();
        String fraseinvertida = "";
        // Recorrer la frase original de atras para adelante
        for (int i = fraseoriginal.length() - 1; i >= 0; i--) {

            fraseinvertida += fraseoriginal.charAt(i);

        }

        System.out.println("Frase Original es: " + fraseoriginal);
        System.out.println("Frase Invertida es: " + fraseinvertida);
    }

    public int vecesRepetidos(Cadena caracter1) {

        String texto = caracter1.getFrase();

        contador = 0;

        System.out.println("Ingrese un caracter que desee buscar: ");

        String letra = leer.next();

        for (int i = 0; i < caracter1.getLongitudfrase(); i++) {

            if (texto.substring(i, i + 1).equalsIgnoreCase(letra)) {

                contador++;
            }
        }

        System.out.println("El caracter " + letra + " se repite " + contador + " veces");

        return contador;
    }

    public void compararLonguitud(Cadena fraseoriginal, String frasenueva) {

        if (fraseoriginal.getLongitudfrase() > frasenueva.length()) {
            System.out.println("La primera frase es mas larga que la segunda");
        } else if (fraseoriginal.getLongitudfrase() < frasenueva.length()) {
            System.out.println("La segunda frase es mas larga que la primera");
        } else {
            System.out.println("Las frases tienen el mismo tamaño");
        }
    }

    public void unirfrase(Cadena fraseoriginal, String frasenueva2) {

        System.out.println("Las frases unidas quedarian " + fraseoriginal.getFrase().concat(" " + frasenueva2));

    }

    public void remplazar(Cadena fraseoriginal, String caracterA) {

        System.out.println("La frase con la letra reemplazada seria:");

        for (int i = 0; i < fraseoriginal.getLongitudfrase(); i++) {

            if (fraseoriginal.getFrase().substring(i, i + 1).equalsIgnoreCase("A")) {

                System.out.print(caracterA);

            } else {

                System.out.print(fraseoriginal.getFrase().substring(i, i + 1));
            }

            System.out.println("");
        }
    }

    public boolean contiene(Cadena fraseoriginal, String letra) {

        boolean aux = false;

        for (int i = 0; i < fraseoriginal.getLongitudfrase(); i++) {

            if (fraseoriginal.getFrase().substring(i, i + 1).equalsIgnoreCase(letra)) {
                aux = true;
            }

        }
        System.out.println("La letra ingresada es " +aux);
        return aux;
    }

}
