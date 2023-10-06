
package S10_03;

import java.util.ArrayList;

/**
 *
 * @author dieoa
 */
public class Main_S10_03 {
    
    
    public static void main(String[] args) {
        
        
        
        futbolista_03 futbolista1 = new futbolista_03(9, "arquero", 1, "Paolo", "Guerrero", 42);
        masajista_03 masajista1 = new masajista_03("si", 15, 2, "raul", "martinez", 50);
        entrenador_03 RicardoGareca = new entrenador_03("uno", 1, "Ricardo", "Gareca", 65);
        
        
        //Viaje(todos)
       
        
        //ENTRENAR
        futbolista1.concentrarse();
        futbolista1.entrenar();
        
        masajista1.darMasaje();
        masajista1.concentrarse();
     
    }
}
