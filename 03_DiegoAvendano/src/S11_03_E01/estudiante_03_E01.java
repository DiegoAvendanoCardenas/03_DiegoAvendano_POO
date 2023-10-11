package S11_03_E01;
/*
 @author 03_DiegoAvendano
*/
public class estudiante_03_E01 extends Persona_03_E01{
    
    //Metodo constructor
    public estudiante_03_E01(int ciclo, String carrera, String seccion, String nombre, String edad) {
        super(nombre, edad);
        this.ciclo = ciclo;
        this.carrera = carrera;
        this.seccion = seccion;
    }
    
   //Atributos
   int ciclo;
   String carrera;
   String seccion;
   
   //Metodos
   public void Estudiar(){
       
   }
   public void Recuperacion(){

   }
   
}
