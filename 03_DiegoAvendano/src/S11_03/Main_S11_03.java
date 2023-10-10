
package S11_03;

/**
 * @author LAB_1
 */
public class Main_S11_03 {
    public static void main(String[] args) {
        Estudiante_03 objEstudiante = new Estudiante_03("Agraria", 3, "Fernando", 18);
        objEstudiante.hablar();
        objEstudiante.caminar();
        objEstudiante.escuchar();
        objEstudiante.getNombre();
        objEstudiante.getEdad();
        
        
        Profesor_03 objProfesor = new Profesor_03("Matematica", 5, "Fernando", 25);
        
        
    }
}
