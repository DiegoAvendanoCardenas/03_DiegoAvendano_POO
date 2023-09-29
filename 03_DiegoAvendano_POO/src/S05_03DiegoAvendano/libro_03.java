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
public class libro_03 {
    
    //Atributos
    String titulo;
    String autor;

    public libro_03() {
        titulo = "";
        autor = "";
    }
     //Sobrecarga de Metodos

    public void ingresarDatos() {
        titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Título: " + titulo + "\nAutor: " + autor);
    }
}
