/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S05_03DiegoAvendano;

import java.util.Scanner;

/**
 *
 * @author dieoa
 */
public class auto_03 {
     //Atributos
    String marca;
    String modelo;

    public auto_03() {
        marca = "";
        modelo = "";
    }
        //Sobrecarga de Metodos

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca del auto: ");
        marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del auto: ");
        modelo = scanner.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("Marca del auto: " + marca);
        System.out.println("Modelo del auto: " + modelo);
    }
}
