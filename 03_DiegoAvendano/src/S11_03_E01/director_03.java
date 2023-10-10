/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_03_E01;

/**
 *
 * @author LAB_1
 */
public class director_03 extends Persona_03{

    public director_03(String añosDePuesto, String colegio, String nivelAcademico, String nombre, String edad) {
        super(nombre, edad);
        this.añosDePuesto = añosDePuesto;
        this.colegio = colegio;
        this.nivelAcademico = nivelAcademico;
    }
    
    
    
    
    String añosDePuesto;
    String colegio;
    String nivelAcademico;
            
            
    public void charlasAcademicas(){
    }
    public void realizarReuniones(){
    }
}
