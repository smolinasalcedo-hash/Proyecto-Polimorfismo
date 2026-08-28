
package polimorfismo;

public class Persona 

{
    private String nombre="";
    private int edad=0;
    private double estaturaMetros=0.0;
    
    public Persona(String nombre) {
        
        this.nombre = nombre;
    }


    public Persona(String nombre, int edad) {
        
        this.nombre = nombre;
        this.edad = edad;
   
    }


    public Persona(String nombre, int edad, double estaturaMetros) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.estaturaMetros = estaturaMetros;
    }



}
