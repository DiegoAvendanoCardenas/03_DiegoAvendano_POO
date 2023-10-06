package S10_03;

/**
 *
 * @author dieoa
 */
public class masajista_03 extends seleccionFutbol_03{
    
    
    //metodo constructor
    public masajista_03(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    //Atributos

    private String titulacion;
    private int aniosExperiencia;

    //Metodos


    public void darMasaje() {
        System.out.println(nombre + " da masaje");
    }
}
