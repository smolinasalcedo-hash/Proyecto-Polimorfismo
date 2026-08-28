
package polimorfismo;

public class Polimorfismo 
{

    public static void main(String[] args) 
    {
        Persona p1 = new Persona("Carlos");
        Persona p2 = new Persona("Ana", 25);
        Persona p3 = new Persona("Luis", 40, 1.82);

        Animal a1 = new Animal("Gato");
        Animal a2 = new Animal("León", 190.5);
        Animal a3 = new Animal("Perro", 15.2, true);
 
        Alienigena al1 = new Alienigena("Marciano");
        Alienigena al2 = new Alienigena("Zeta Reticulano", 4);
        Alienigena al3 = new Alienigena("Depredador", 2, true);

        Planeta pl1 = new Planeta("Venus");
        Planeta pl2 = new Planeta("Júpiter", 79);
        Planeta pl3 = new Planeta("Marte", 2, 'R');
    
    
    
    
    
    }
    
}
