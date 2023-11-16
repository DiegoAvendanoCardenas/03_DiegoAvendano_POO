package S11_03_E01;
/*
 @author 03_DiegoAvendano
*/
public class Main_S11_03_E01 {
    public static void main(String[] args) {
       
        //Objeto de la clase estudiante_03_E01
       estudiante_03_E01 objEstudiante = new estudiante_03_E01(5, "Analisis de sitemas", "B", "Diego", "19");
       objEstudiante.Estudiar();
       objEstudiante.Recuperacion();
       
       /*-----------------------------------------------------------------------------------------------*/
       
       //Objeto de la clase director_03_E01
       director_03_E01 objDirector = new director_03_E01("2", "Miguel Grau", "Secundaria", "Coronel", "35");
       objDirector.charlasAcademicas();
       objDirector.realizarReuniones();
       
       /*-----------------------------------------------------------------------------------------------*/
       
       //Objeto de la clase profesor_03_E01
       profesor_03_E01 objProfesor = new profesor_03_E01("BD", 5, "Mañana", "Gustavo", "25");
       objProfesor.Enseñanza();
       objProfesor.seleccionarHoraDeClases();
       
    }
}
