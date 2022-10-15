 /* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
package guia7.ej1.entidades;

public class Libro {
   
    //Atributos
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int NPagina;

   //Constructor Vacio

    public Libro() {
    }
    
   // Contructor con Atributos

    public Libro(String ISBN, String Titulo, String Autor, int NPagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NPagina = NPagina;
    }
    
    
    
    
    
    
}
