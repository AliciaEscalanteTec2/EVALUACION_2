/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_comparar;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_6_COMPARAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                    //INTRUCCIONES: 
        //CUAL ES EL MAYOR VALOR ENTRE DOS NÚMEROS
        
        //DATOS A USAR:
        int num1, num2;
        Scanner captu = new Scanner(System.in);
        
        //PEDIR AL USUARIO DOS NÚMEROS ENTEROS
        System.out.println("Primer numero a comparar: ");
        num1 = captu.nextInt();
        System.out.println("Segundo numero a comparar: ");
        num2 = captu.nextInt();
        
        //CUAL ES EL MAYOR
        if (num1 > num2) {
            System.out.println(num1 + " es mayor!!!");
        }else{
            if (num1 == num2) { //Comparando num1 es igual a num2
                System.out.println(num1 +" y "+num2 + " son iguales!!!");
            } else{
                System.out.println(num2 + " es mayor!!!");
            }
        }
        
    }
    //ALICIA ESCALANTE SOSA     No.Control: 24550008
    
}
