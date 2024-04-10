/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_for;

/**
 *
 * @author Usuario
 */
public class EVA2_18_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
                    CICLO FOR
        INICIO; CONDICION; INCREMENTO/DECREMENTO
        */
        
        //      INSTRUCCIÓN:
        //EJECUTAR UNA INTRUCCIÓN 10 VECES
        for (int i = 1; i <= 10; i++) {
            //LAS LLAVES SON OPCIONALES, SOLO SE USA CUANDO SE QUIERA
            //TENER MAS DE UNA INTRUCCIÓN A REPETIR
            //EL 10 NOS DICE QUE ES HASTA DONDE VA A LLEGAR
            System.out.print(i + " - "); //se repitio 10 veces
        }
        System.out.println();
        for (int i = 10; i >=1; i--) {
            System.out.print(i + " - "); //se repitio 10 veces
        }
        System.out.println();
        //      INTRUCCIÓN:
        //IMPRIMIR LOS NUMEROS PARES ENTRE 0 Y 100 (2,4,6,8,10...)
        for (int i = 0; i <= 100; i+=2 ) { //para incrementar de 2 en 2
            System.out.print(i + "-"); //se repitio 51 veces
        }
        
    }
            //ALICIA ESCALANTE SOSA    No.control:24550008
}
