/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ventas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_4_VENTAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capturar = new Scanner(System.in);
        
        int numP, calcSaldo;
        
        System.out.println("Cuantas piezas vas a comprar?");
        numP = capturar.nextInt();
        
        if (numP > 1000) {
            calcSaldo = numP * 500;
        }else{
            calcSaldo = numP * 800;
        }
        System.out.println("El saldo es: "+calcSaldo);
        
    }
    //ALICIA ESCALANTE SOSA   No.Control: 24550008
}
