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
    
    //3 Atributos 03_DiegoAvendano
    String añosDePuesto;
    String colegio;
    String nivelAcademico;
            
    //2 Metodos 03_DiegoAvendano     
    public void charlasAcademicas(){
        System.out.println("Hacer Charlas a Alumnos");
    }
    public void realizarReuniones(){
        System.out.println("Reunirse con los profesores para mejorar el aprendizaje");
    }
}
