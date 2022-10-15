package servicios;

import entidades.Persona;
import java.util.Locale;
import java.util.Scanner;

public class servicioPersona {
    
    public Persona crearPersona(){
    
      Scanner leer = new Scanner (System.in).useDelimiter("\n").useLocale(Locale.US);
      
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
       
        String sexo;
        
        do {
        System.out.println("Ingrese su sexo, H para hombre, M para mujer y O indefinido");
        sexo = leer.next();
        
        } while(!"O".equalsIgnoreCase(sexo) && !"M".equalsIgnoreCase(sexo) && !"H".equalsIgnoreCase(sexo));
        
      
        System.out.println("Ingrese su peso");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese su altura");
        double altura = leer.nextDouble();
        
        
    return new Persona(nombre,edad,sexo,peso,altura);
    
    }
    
    public int calcularIMC(Persona P1){
        
     int retorno;
     double IMC;
     //kg/(altura^2 en mt2))
     IMC = P1.getPeso()/Math.pow(P1.getAltura(),2); 
     
     if (IMC<20){
     
         retorno = -1;
                 
     } else if (IMC>=20 && IMC <= 25) {
     
     
         retorno= 0;
     
     } else {
    
         retorno=1;  
     }
    
             
    return retorno;
     
        
    }
     public boolean mayordeEdad(Persona P1){
     
             
     return P1.getEdad()>=18;
     
     }
    
     
     
     
    }
