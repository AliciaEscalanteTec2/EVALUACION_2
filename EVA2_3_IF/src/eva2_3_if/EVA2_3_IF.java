/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner captu = new Scanner(System.in);
        
        double califa;
        System.out.println("Cual fue la calificacion?");
        califa = captu.nextDouble();
        
        if (califa >=70) { //ESTA SECCIÓN --> TRUE
            //{} OPCIONALES, SOLO CUANDO TENEMOS MÁS DE UNA INSTRUCCIÓN
            System.out.println("ACREDITASTE! ");
                    
        }else { //La parte de false es opcional 
            System.out.println("UPS, NO ACREDITASTE! MEJOR SUERTE EL PROXIMO PARCIAL");
        } 
        //AQUI CONTINUA EL PROGRAMA
        
    }
    //ALICIA ESCALANTE SOSA    No.control: 24550008
}
