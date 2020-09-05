
package miapp;

/**
 *
 * @author Dou
 */
public class Estudiante {
    
    String nombre = "";
    
    public void ingresarNombre(String nombre){
        
        this.nombre = nombre;
    }
    
    public String getNombre(){
        
        return nombre;
    }
    
    public static void main(String[] args){
        
        Estudiante estudent1 = new Estudiante();
        estudent1.ingresarNombre("Douglas");
        estudent1.getNombre();
    }
}
