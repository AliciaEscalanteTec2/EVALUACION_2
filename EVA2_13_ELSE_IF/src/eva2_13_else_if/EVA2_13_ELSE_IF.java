/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_13_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                            // INSTRUCCIONES:
        // REALIZAR UN PROGRAMA QUE DIGAS UN NÚMERO Y TE IMPRIMA QUE DÍA DE LA 
        // SEMANA ES 
        
        int dia;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el dia de la semana en numero (1-7): ");
        dia = captu.nextInt();
        
        if (dia == 1)
            System.out.println("El dia es DOMINGO");
        else if (dia == 2) 
                System.out.println("El dia es LUNES");
        else if (dia == 3) 
                System.out.println("El dia es MARTES");
        else if (dia == 4) 
                System.out.println("El dia es MIERCOLES");
        else if (dia == 5) 
                System.out.println("El dia es JUEVES");
        else if (dia == 6) 
                System.out.println("El dia es VIERNES");
        else if (dia == 7) 
                System.out.println("El dia es SABADO");
        else
            System.out.println("El numero NO es un dia valido");
    }
        //ALICIA ESCALANTE SOSA     No.control = 24550008
    
}
