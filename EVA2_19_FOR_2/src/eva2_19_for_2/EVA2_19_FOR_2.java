/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_19_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PREGUNTAR: CANTIDAD DE ESTUDIANTES EN EL GRUPO:
        int numAlum;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cuantos estudiantes tiene el grupo?");
        numAlum = captu.nextInt();
        
        //HAY QUE CAPTURAR TODAS LAS CALIFICACIÓNES
        //EN ESTE CASO SI SABEMOS LA CANTIDAD DE ESTUDIANTES PORQUE LE 
        //PREGUNTAMOS AL USUARIO Y POR ESO SE USA UN FOR
        for (int i = 0; i < numAlum; i++) {
            /*
            si empiezo en 0 es <
            for (int i = 0; i < numAlum; i++)
            si empiezo en 1 es <=
            for (int i = 1; i <= numAlum; i++)
            */
            System.out.println("Calificacion: ");
            int califa = captu.nextInt();
        }
        
    }
        //ALICIA ESCALANTE SOSA    No.control:24550008
}
