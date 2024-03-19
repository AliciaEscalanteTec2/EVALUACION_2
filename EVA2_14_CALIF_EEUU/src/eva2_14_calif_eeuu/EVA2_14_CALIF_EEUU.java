/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_14_CALIF_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
                            INSTRUCCIONES:
        SACAR CALIFICACIONES AMERICANAS CON EL SIGUIENTE RANGO:
        A 90 a 100
        B 80 a 89
        C 70 a 79
        D 60 a 69
        F 0 a 59
        */
        
        int calif;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce tu calificacion: ");
        calif = captu.nextInt();
        
        if (calif >= 90 && calif <= 100) //A
            System.out.println("Tu calificacion es: A ");
        else if (calif >= 80 && calif <= 89) //B
            System.out.println("Tu calificacion es: B");
        else if (calif >= 70 && calif <= 79) //C
            System.out.println("Tu calificacion es: C");
        else if (calif >= 60 && calif <= 69) //D
            System.out.println("Tu calificacion es: D");
        else if (calif >= 0 && calif <= 59) //F
            System.out.println("Tu calificacion es: F");
        else
            System.out.println("Calificacion NO valida");
    }
    //ALICIA ESCALANTE SOSA -1    No.control= 24550008
}
