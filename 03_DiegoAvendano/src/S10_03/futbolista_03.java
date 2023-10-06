package S10_03;

/**
 *
 * @author DiegoAvendaño
 */
public class futbolista_03 extends seleccionFutbol_03{
    

    //Metodo constructor
    public futbolista_03(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    
    
    
    
    
    //Atributos
        
    private int dorsal;
    private String demarcacion;
    
    //Metodos
    
    
    public void jugarPartido(){
        System.out.println(getNombre()+" esta jugando partido");
    }
    
    public void entrenar(){
        System.out.println(getNombre()+" esta entrenando");
    }
    
    //Get and Set

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
