
package servicio;
import entidades.Matematica;
import static java.lang.Math.round;

public class ServicioMatematica {
     
   
    public static void devolverMayor(Matematica m1){
       
        if (m1.getNum1() > m1.getNum2()){
   
        System.out.println("El numero 1 es mayor que numero2");
       
        } else if (m1.getNum2()> m1.getNum1()){
           
            System.out.println("El numero 2 es mayor al numero 1");
       
        } else
           
            System.out.println("Los dos numeros son iguales");  
           
    }
   
    public static void calcularPotencia(Matematica m1){
       
        System.out.println("La potencia del numero mayor elevado al menor es: " + Math.pow(round(Math.max(m1.getNum1(), m1.getNum2())), round(Math.min(m1.getNum1(), m1.getNum2()))));

    }

    public static void calcularRaiz(Matematica m1) {
       
        System.out.println("La raiz cuadrada del numero menor es: " + Math.sqrt(round(Math.min(m1.getNum1(), m1.getNum2()))));
    }
       
       
    }
    

