
package S10_03;

/**
 *
 * @author dieoa
 */
public class entrenador_03 extends seleccionFutbol_03{

    public entrenador_03(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
    
    //Atributos

    private String idFederacion;
    
    //Metodos

    
    public void dirigirPartido(){
    
    }    
    
    public void dirigirEntrenamiento(){
        System.out.println(nombre + " es el  entrenador");
    }
}
