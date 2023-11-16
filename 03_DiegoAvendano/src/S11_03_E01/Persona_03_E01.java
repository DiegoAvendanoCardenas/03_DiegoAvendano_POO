package S11_03_E01;
/*
 @author 03_DiegoAvendano
*/
public class Persona_03_E01 {
    
    //Metodo constructor 03_DiegoAvendano
    public Persona_03_E01(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // 2 Atributos
    String nombre;
    String edad;
    
    // 2 Metodos 03_DiegoAvendano
    public void entrenar(){
        System.out.println("Rutina");
    }
    
    public void comer(){
        System.out.println("Comer Algo");
    }
    
    //Metodos Get and Setter 03_DiegoAvendano
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
