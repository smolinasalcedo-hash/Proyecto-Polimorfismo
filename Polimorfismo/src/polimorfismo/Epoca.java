
package polimorfismo;

public class Epoca 
{
  private String nombreEpoca="";
  private int año = 0;
  boolean fantasia = false;
  
  
  public Epoca(String nombreEpoca){
  
  this.nombreEpoca = nombreEpoca;
  }
  
  public Epoca(String nombreEpoca, int año){
  
    this.nombreEpoca = nombreEpoca;
    this.año = año;
  }
  
  public Epoca(String nombreEpoca, int año, boolean fantasia){
  
    this.nombreEpoca = nombreEpoca;
    this.año = año;
    this.fantasia = fantasia;
  
  }




}
