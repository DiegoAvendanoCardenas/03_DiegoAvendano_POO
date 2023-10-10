/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_03;

/**
 *
 * @author LAB_1
 */
public class Estudiante_03 extends Persona_03{

    public Estudiante_03(String carrera, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.ciclo = ciclo;
    }
    
    
    
    String carrera;
    int ciclo;
}
