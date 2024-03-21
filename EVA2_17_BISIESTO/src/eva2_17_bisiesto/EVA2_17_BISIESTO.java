/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                     //INSTRUCCIONES
        //PEDIR EL AÑO Y DECIR SI ES BISIESTO O NO
        
        int año, div;
        int residuo1, residuo2, residuo3;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("======== ES BISIESTO? ========");
        System.out.println("");
        System.out.println("Introduce la fecha:  ");
        año = captu.nextInt();
        
        div = año / 4;
        residuo1 = año % 4;
        residuo2 = año % 100;
        residuo3 = año % 400;
        
        if (residuo1 == 0)
            System.out.println("ES BISIESTO");
        else if (residuo2 == 0 && residuo3 == 400 )
            System.out.println("ES BISIESTO");
        else
            System.out.println("NO ES BISIESTO");
 
    }
        //ALICIA ESCALANTE SOSA    No.control:24550008
}
