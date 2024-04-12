/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_20_FOR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
                        INSTRUCCIONES:
        1- PREGUNTAR UN MENSAJE Y PREGUNTAR CUANTAS VECES LO VAN A REPETIR E
        IMPRIMIR ESE NÚMERO DE VECES.
        
        2- IMPRIMIR LA SUMATORIA DE UN NÚMERO:
        SOLICITAR UN NUMERO ENTERO, CALCULAR LA SUMATORIA. EJEMPLO:
        El usuario introduce el 5, calcular:
        1+2+3+4+5
        
        3- CAPTURAR UN NUMERO E IMPRIMIR UNA SECUENCIA DE *. EJEMPLO:
        El usuario captura 5:
        * 
        **
        ***
        ****
        *****
        
        */
        int numControl, numVeces;
        int numE, num2;
        int suma = 0;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("==== PROBLEMA 1 ====");
        System.out.print("Cual es tu numero de control? ");
        numControl = captu.nextInt();
        System.out.print("Cuantas veces se va a repetir ese numero? ");
        numVeces = captu.nextInt();
        
        for (int i = 0; i < numVeces; i++) {
            System.out.println(numControl);
        }
        System.out.println();
        
        System.out.println("==== PROBLEMA 2 ====");
        System.out.print("Introduce el numero entero: ");
        numE = captu.nextInt();
        for (int i = 1; i <= numE; i++) {
             suma +=i;
            System.out.println("La suma es: "+suma);
        }
        System.out.println();
        
        System.out.println("==== PROBLEMA 3 ====");
        System.out.print("Introduce el numero entero: ");
        num2 = captu.nextInt();
        
        for (int i = 1; i <= num2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("==== PROBLEMA 4 ====");
        System.out.print("Introduce el numero entero: ");
        num2 = captu.nextInt();
        
        for (int i = 1; i <= num2; i++) {
            for (int j = i; j <=num2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //ALICIA ESCALANTE SOSA  No.control:24550008
        
    }
    
}
