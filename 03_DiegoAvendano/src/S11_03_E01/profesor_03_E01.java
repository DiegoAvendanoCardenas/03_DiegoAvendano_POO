package S11_03_E01;

/**
 *
 * @author LAB_1
 */
public class profesor_03_E01 extends Persona_03_E01{

    public profesor_03_E01(String especialidad, int añoDeExp, String turno, String nombre, String edad) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.añoDeExp = añoDeExp;
        this.turno = turno;
    }
    
    
    
    
    String especialidad;
    int añoDeExp;
    String turno;
    
    public void Enseñanza (){
    }
    public void tomarAsistencia(){
    }
    public void seleccionarHoraDeClases(){
    }


}