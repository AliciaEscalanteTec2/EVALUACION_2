/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_operadores_logicos;

/**
 *
 * @author Usuario
 */
public class EVA2_2_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean A, B;
        //A = false;
        //B = true;
        
        //A = true;
        //B = false;
        
        A = true;
        B = true;
        
        boolean resu;
        
        //OPERADOR AND --> &&
        resu = A && B;
        System.out.println("Resu = "+resu);
        
        //OPERADOR OR ||
        A = false;
        B = false;
        resu = A || B;
        System.out.println("Resu (or) = "+resu);
        
        A = true;
        B = false;
        resu = A || B;
        
        System.out.println("Resu (or) = "+resu);
        
        //NEGACION --> !
        A = false;
        resu = !A;
        System.out.println("Resu (!) = "+resu);
        
        
        //ALICIA ESCALANTE SOSA    No.Control: 24550008
    }
    
}
