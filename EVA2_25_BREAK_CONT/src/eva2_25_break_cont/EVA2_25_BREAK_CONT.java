/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_break_cont;

/**
 *
 * @author Usuario
 */
public class EVA2_25_BREAK_CONT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 100; i++) {
            int mod = i % 2;
            if (mod != 0) { //QUEREMOS LOS CASOS QUE SEAN IGUALES 
                continue; //CUANDO SE EJECUTA, SE REPITE LA ITERACCIÓN ACTUAL 
                //(IGNORA LO DE ABAJO)
            }
            System.out.println(i);
        }
        System.out.println("BREAK: >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i == 50) {
                break; //DETUVO EL CICLO COMPLETAMENTE, YA NO EJECUTA EN ESTE CASO LOS OTROS 
                //NÚMEROS 
            }
        }
        
        // ALICIA ESCALANTE SOSA    No.control = 24550008
        
    }
    
}
