/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_switch;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_16_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int mes;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("======== MESES DEL AÑO ========");
        System.out.println("");
        System.out.println("Introduce el numero del mes:  ");
        mes = captu.nextInt();
        
        switch (mes){
            case 1:
                System.out.println("El mes es ENERO");
                break; //TERMINA EL CASO (SWITCH)
            case 2:
                System.out.println("El mes es FEBRERO");
                break; //TERMINA EL CASO (SWITCH)
            case 3:
                System.out.println("El mes es MARZO");
                break; //TERMINA EL CASO (SWITCH)
            case 4:
                System.out.println("El mes es ABRIL");
                break; //TERMINA EL CASO (SWITCH)
            case 5:
                System.out.println("El mes es MAYO");
                break; //TERMINA EL CASO (SWITCH)
            case 6:
                System.out.println("El mes es JUNIO");
                break; //TERMINA EL CASO (SWITCH)
            case 7:
                System.out.println("El mes es JULIO");
                break; //TERMINA EL CASO (SWITCH)
            case 8:
                System.out.println("El mes es AGOSTO");
                break; //TERMINA EL CASO (SWITCH)
            case 9:
                System.out.println("El mes es SEPTIEMBRE");
                break; //TERMINA EL CASO (SWITCH)
            case 10:
                System.out.println("El mes es OCTUBRE");
                break; //TERMINA EL CASO (SWITCH)
            case 11:
                System.out.println("El mes es NOVIEMBRE");
                break; //TERMINA EL CASO (SWITCH)
            case 12:
                System.out.println("El mes es DICIEMBRE");
                break; //TERMINA EL CASO (SWITCH)
            default: //VA AL FINAL DE TODAS LAS INSTRUCCIONES Y NO LLEVA BREAK
                System.out.println("Ingresaste un numero de mes no valido");
             
            // EL BREAK EJECUTA LA INSTRUCCIÓN Y SE SALE DEL SWITCH, SI LO DEJO
            // VA A IMPRIMIR LOS RESTANTES
        }
            
    }
            //ALICIA ESCALANTE SOSA      No.control: 24550008
}
