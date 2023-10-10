/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_03_E01;

/**
 *
 * @author LAB_1
 */
public class estudiante_03 extends Persona_03{

    public estudiante_03(int ciclo, String carrera, String seccion, String nombre, String edad) {
        super(nombre, edad);
        this.ciclo = ciclo;
        this.carrera = carrera;
        this.seccion = seccion;
    }
    
    
    
    
   int ciclo;
   String carrera;
   String seccion;
   
   
   public void Estudiar(){
   }
   public void Recuperacion(){
   }
   
}
