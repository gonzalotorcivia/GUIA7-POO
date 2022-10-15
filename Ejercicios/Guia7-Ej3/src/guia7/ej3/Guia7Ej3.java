package guia7.ej3;

import guia7.ej3.entidades.Operacion;

public class Guia7Ej3 {

    public static void main(String[] args) {

        Operacion op = new Operacion();

        op.CrearOperacion();

        System.out.println("La suma es: " + op.Suma());

        System.out.println("La resta es: " + op.Resta());

        if (op.Multiplicar() == 0) {

            System.out.println("Operacion Incorrecta");

        } else {

            System.out.println("La multiplicaicon es: " + op.Multiplicar());
        }

        if (op.dividir()== 0) {
            
            System.out.println("Operacion Incorrecta");
            
        } else {
            
            System.out.println("La Division es: " + op.dividir());
        }
        
        

    }

}
