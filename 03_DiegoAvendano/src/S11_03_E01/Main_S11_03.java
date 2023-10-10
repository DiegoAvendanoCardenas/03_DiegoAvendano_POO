
package S11_03_E01;

/**
 * @author LAB_1
 */
public class Main_S11_03 {
    public static void main(String[] args) {
       estudiante_03 objEstudiante = new estudiante_03(5, "Analisis de sitemas", "B", "Diego", "19");
       objEstudiante.Estudiar();
       objEstudiante.Recuperacion();
       director_03 objDirector = new director_03("2", "Miguel Grau", "Secundaria", "Coronel", "35");
       profesor_03 objProfesor = new profesor_03("BD", 5, "Mañana", "Gustavo", "25");
    }
}
