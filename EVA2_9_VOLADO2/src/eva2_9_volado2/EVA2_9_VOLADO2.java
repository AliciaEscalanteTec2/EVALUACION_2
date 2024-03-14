/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_9_VOLADO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                         //EJERCICIO HECHO POR MI
        
        double moneda;
        int resp;
        Scanner captu = new Scanner(System.in);
        moneda = Math.random();
        System.out.println("Que prefieres... 1-CARA  2-CRUZ");
        resp = captu.nextInt();
        System.out.println();
        System.out.println("Ten en cuenta que mayor a 0.5 es cara y menor a 0.5 es cruz");
        System.out.println();
        System.out.println("El valor de la moneda es = "+moneda);

        if (moneda > 0.5 && resp==1) {
            System.out.println("CARA");
            System.out.println("HAS ADIVINADO!!");
        }
        if (moneda > 0.5 && resp==2) {
            System.out.println("CARA");
            System.out.println("NOOO HAS ADIVINADO!!");
        }
        if (moneda < 0.5 && resp== 1) {
            System.out.println("CRUZ");
            System.out.println("NO HAS ADIVINADO!!");
        }
        if (moneda < 0.5 && resp== 2) {
            System.out.println("CRUZ");
            System.out.println("SI HAS ADIVINADO!!");
        }
        
        //ALICIA ESCALANTE SOSA   No.Control: 24550008
    }
    
}
