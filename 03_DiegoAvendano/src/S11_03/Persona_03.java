
package S11_03;

/**
 *
 * @author LAB_1
 */
public class Persona_03 {

    public Persona_03(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    private String nombre;
    private int edad;
    
    public void hablar(){ 
    }
    public void escuchar(){
    }
    
    public void caminar(){
    }
    
    // GET AN SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
