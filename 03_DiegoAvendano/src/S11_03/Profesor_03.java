
package S11_03;

/**
 *
 * @author LAB_1
 */
public class Profesor_03  extends Persona_03{

    public Profesor_03(String curso, int añoDeExperiencia, String nombre, int edad) {
        super(nombre, edad);
        this.curso = curso;
        this.añoDeExperiencia = añoDeExperiencia;
    }
    
    //Atributos
    String curso;
    int añoDeExperiencia;
    
    //Metodos
}
