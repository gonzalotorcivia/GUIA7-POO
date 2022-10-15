package guia7.ej11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Guia7Ej11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento");
        int año = leer.nextInt();
        // creamos la fecha date
        Date fecha = new Date(año - 1900, mes - 1, dia);
        System.out.println("La fecha de nacimiento es: " + fecha);
        // formateo la fecha para verla en el formato que yo quiera
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaconvertida = sdf.format(fecha);
        System.out.println("La persona nacio el: " + fechaconvertida);
        // comparo cuantos años hay entre la fecha actual y la fecha de nacimiento
        Date fechaactual = new Date();
        int años = (fechaactual.getYear() - fecha.getYear());
        System.out.println("La persona tiene " + años + " años");

    }
}


