package detecciondeerrores.entidades;

public class Persona {
    
    // creacion de atributos
    public String nombre;
    public String apellido;
    public String DNI;

    // contructor de la clase
    public Persona() {
    
    }

     // contructor de los atributos
    public Persona(String nombre, String apellido, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    
    
}
