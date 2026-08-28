
package polimorfismo;

public class Planeta 
{
    private String nombre="";
    private int cantidadLunas=0;
    private char categoria='X'; 


    public Planeta(String nombre) {
        
        this.nombre = nombre;

    }


    public Planeta(String nombre, int cantidadLunas) {
        
        this.nombre = nombre;
        this.cantidadLunas = cantidadLunas;

    }


    public Planeta(String nombre, int cantidadLunas, char categoria) {
        
        this.nombre = nombre;
        this.cantidadLunas = cantidadLunas;
        this.categoria = categoria;
    }



}
