package S11_03_E01;
/*
 @author 03_DiegoAvendano
*/
public class estudiante_03_E01 extends Persona_03_E01{
    
    //Metodo constructor 03_DiegoAvendano
    public estudiante_03_E01(int ciclo, String carrera, String seccion, String nombre, String edad) {
        super(nombre, edad);
        this.ciclo = ciclo;
        this.carrera = carrera;
        this.seccion = seccion;
    }
    
   //3 Atributos 03_DiegoAvendano
   int ciclo;
   String carrera;
   String seccion;
   
   //dos Metodos 03_DiegoAvendano
   public void Estudiar(){
       System.out.println("Estudiar POO");
   }
   public void Recuperacion(){
       System.out.println("Recuperar POO pipipi :'v ");
   }
   
}
