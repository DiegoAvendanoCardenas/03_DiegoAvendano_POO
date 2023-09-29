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
public class cuentaBancaria_03 {

    private String titular;
    private double saldo;

    public cuentaBancaria_03() {
        titular = "";
        saldo = 0.0;
    }
    //Sobrecarga de Metodos
    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del titular de la cuenta: ");
        titular = scanner.nextLine();
        System.out.print("Ingrese el saldo de la cuenta: ");
        saldo = scanner.nextDouble();
    }

    public void mostrarDatos() {
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Saldo de la cuenta: " + saldo);
    }
}
