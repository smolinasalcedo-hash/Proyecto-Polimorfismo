
package polimorfismo;

public class Trabajo {
    
    private String cargo="";
    private int cantidadTrabajadores = 0;
    private boolean rentable = false;
    
    
    public Trabajo(String cargo){
        
        this.cargo = cargo;
    }
    
    public Trabajo(String cargo, int cantidadTrabajadores){
        
        this.cargo = cargo;
        this.cantidadTrabajadores = cantidadTrabajadores;
    }
    
    public Trabajo(String cargo, int cantidadTrabajadores, boolean rentable){
        
        this.cargo = cargo;
        this.cantidadTrabajadores = cantidadTrabajadores;
        this.rentable = rentable;
    }
    
}
