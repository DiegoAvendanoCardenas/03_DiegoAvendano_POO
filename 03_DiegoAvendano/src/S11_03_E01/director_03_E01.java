package S11_03_E01;
/*
 @author 03_DiegoAvendano
*/
public class director_03_E01 extends Persona_03_E01{
    
    //Metodo constructor
    public director_03_E01(String añosDePuesto, String colegio, String nivelAcademico, String nombre, String edad) {
        super(nombre, edad);
        this.añosDePuesto = añosDePuesto;
        this.colegio = colegio;
        this.nivelAcademico = nivelAcademico;
    }
    
    //Atributos
    String añosDePuesto;
    String colegio;
    String nivelAcademico;
            
    //Metodos     
    public void charlasAcademicas(){
        
    }
    public void realizarReuniones(){
        
    }
}
