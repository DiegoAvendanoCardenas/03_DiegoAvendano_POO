package S11_03_E01;
/*
 @author 03_DiegoAvendano
*/
public class Persona_03_E01 {
    
    //Metodo constructor
    public Persona_03_E01(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Atributos
    String nombre;
    String edad;
    
    //Metodos
    public void entrenar(){
    
    }
    
    public void comer(){
    
    }
    
    //Metodos Get and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
}
