/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_operadores_logicos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_10_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                         //EJERCICIO HECHO EN CLASE ENTRE TODOS
        
        double moneda;
        int adivinar;
        Scanner captu = new Scanner(System.in);
        moneda = Math.random();
        
        System.out.println("Que prefieres... 0-CARA  1-CRUZ");
        adivinar = captu.nextInt();
        System.out.println();
        System.out.println("Ten en cuenta que mayor a 0.5 es cara y menor a 0.5 es cruz");
        System.out.println();
        System.out.println("El valor de la moneda es = "+moneda);
        
        if (moneda > 0.5 && adivinar == 0) {
            System.out.println("Adivinaste, es cara!!");
        }else{
            if (moneda <= 0.5 && adivinar == 1) {
                System.out.println("Adivinaste, es cruz!!");
            }else{
                System.out.println("Perdiste!!");
            }
        }
        
        //ALICIA ESCALANTE SOSA   No.control: 24550008
    }
    
}
