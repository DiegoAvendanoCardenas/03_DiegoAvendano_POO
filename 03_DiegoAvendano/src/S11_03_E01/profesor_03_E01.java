package S11_03_E01;
/**
 * @author 03_DiegoAvendaño
 */
public class profesor_03_E01 extends Persona_03_E01{
    //Constructor
    public profesor_03_E01(String especialidad, int añoDeExp, String turno, String nombre, String edad) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.añoDeExp = añoDeExp;
        this.turno = turno;
    }
    
    //3 Atributos 03_DiegoAvendaño
    String especialidad;
    int añoDeExp;
    String turno;
    
    //2 Metodos 03_DiegoAvendaño
    public void Enseñanza (){
        System.out.println("Enseñar Alumnos");
    }
    public void tomarAsistencia(){
        System.out.println("Tomar Asistencia");
    }
    public void seleccionarHoraDeClases(){
        System.out.println("ver el horario");
    }


}
