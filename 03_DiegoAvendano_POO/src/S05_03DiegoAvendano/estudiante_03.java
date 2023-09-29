/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_03DiegoAvendano;

import javax.swing.JOptionPane;

/**
 *
 * @author dieoa
 */
public class estudiante_03 {
     //Atributos
    String nombre;
    int edad;

    public estudiante_03() {
        nombre = "";
        edad = 0;
    }
    //Sobrecarga de Metodos
    public void ingresarDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nEdad: " + edad);
    }
}
