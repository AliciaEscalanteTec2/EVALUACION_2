/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_par_impar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_7_PAR_IMPAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                    //INSTRUCCIONES:
        //DETERMINAR SI UN NÚMERO ES PAR O IMPAR
        
        int num, divi, residuo;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        num = captu.nextInt();
        divi =  num / 2;
        
        System.out.println("Division entera de " +num+ " / 2 = "+ divi);
        
        residuo = num % 2;
        
        System.out.println("El residuo de " +num+ " % 2 = "+ residuo);
        
        //DETERMINAR SI ES PAR O IMPAR
        if (residuo == 0) {
            System.out.println("El numero " +num+ " es par");
        }else{
            System.out.println("El numero " +num+ " es impar");
        }
        
    }
    //ALICIA ESCALANTE SOSA     No.Control: 24550008
}
