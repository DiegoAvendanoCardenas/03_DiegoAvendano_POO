/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_03DiegoAvendano;

/**
 *
 * @author dieoa
 */
public class Main_S05_03DiegoAvendano {
    public static void main(String[] args) {
        //Objetos
        estudiante_03 estudiante = new estudiante_03();
        libro_03 libro = new libro_03();
        cuentaBancaria_03 cuentaBancaria = new cuentaBancaria_03();
        auto_03 auto = new auto_03();
        
        estudiante.ingresarDatos();
        estudiante.mostrarDatos();

        libro.ingresarDatos();
        libro.mostrarDatos();
        
        cuentaBancaria.ingresarDatos();
        cuentaBancaria.mostrarDatos();

        auto.ingresarDatos();
        auto.mostrarDatos();
    }
}
