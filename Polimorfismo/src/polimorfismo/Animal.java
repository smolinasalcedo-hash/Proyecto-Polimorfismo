
package polimorfismo;

public class Animal 
{
    private String especie="";
    private double pesoKg=0.0;
    private boolean esDomestico=false;

   
    public Animal(String especie) {
        
        this.especie = especie;
    }

   
    public Animal(String especie, double pesoKg) {
        
        this.especie = especie;
        this.pesoKg = pesoKg;
    }

    public Animal(String especie, double pesoKg, boolean esDomestico) {
        
        this.especie = especie;
        this.pesoKg = pesoKg;
        this.esDomestico = esDomestico;
    }

}
