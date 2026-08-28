
package polimorfismo;

public class Alienigena 
{
    private String raza="";
    private int numeroOjos=0;
    private boolean esHostil=false;

    
    public Alienigena(String raza) {
        
        this.raza = raza;

    }


    public Alienigena(String raza, int numeroOjos) {
        
        this.raza = raza;
        this.numeroOjos = numeroOjos;
      
    }


    public Alienigena(String raza, int numeroOjos, boolean esHostil) {
        
        this.raza = raza;
        this.numeroOjos = numeroOjos;
        this.esHostil = esHostil;
    }
    
}
