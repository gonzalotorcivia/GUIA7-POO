package servicio;

import entidades.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ServicioPersona {
    
    public Persona crearPersona(){
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese su nombre");
          
        String nombre = leer.next();
        
        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        int año = leer.nextInt();
        Date fecha = new Date(año - 1900, mes - 1, dia);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaconvertida = sdf.format(fecha);
        System.out.println("La persona nacio el: " + fechaconvertida);   
    
       return new Persona(nombre, fecha);
    
    }
    
    public  int calcularEdad(Persona nacimiento){
    
        
        // comparo cuantos años hay entre la fecha actual y la fecha de nacimiento
               
        Date fechaactual = new Date();
        
        Date fnacimiento = nacimiento.getFechanacimiento();
                
        int años = (fechaactual.getYear() - fnacimiento.getYear());
        
        System.out.println("La persona tiene " + años + " años");
        
    return años;
   
    }
    
    public boolean menorQue(int edad, int años) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingresar una edad para comparar:");
        int edad1 = leer.nextInt();
              
    return (edad<años);
          
    } 
    
    public void mostrarPersona(Persona p){  
    
        System.out.println("La persona se llama: " + p.getNombre() );
        System.out.println("La persona nacio el: " + p.getFechanacimiento());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaconvertida = sdf.format(p.getFechanacimiento());
        System.out.println("La persona nacio el: " + fechaconvertida);   
        
    
    }
    
    }
    

