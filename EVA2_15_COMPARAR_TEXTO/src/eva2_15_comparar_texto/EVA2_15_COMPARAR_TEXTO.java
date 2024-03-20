/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_15_COMPARAR_TEXTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //COMPARAR TEXTO EN JAVA
        String dia;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce el dia (lunes, martes...):  ");
        dia = captu.nextLine();
        
        //ASÍ SE COMPARAN CADENAS DE TEXTO CON JAVA
        //NOS APOYAMOS DE LA AYUDA DE .EQUALS(ARG)
        if (dia.equals("lunes")) //NO SE PUEDEN COMPARAR CADENAS CON ==
            System.out.println("2");
        else if(dia.equals("martes"))
            System.out.println("3");
        else if(dia.equals("miercoles"))
            System.out.println("4");
        else if(dia.equals("jueves"))
            System.out.println("5");
        else if(dia.equals("viernes"))
            System.out.println("6");
        else if(dia.equals("sabado"))
            System.out.println("7");
        else if(dia.equals("domingo"))
            System.out.println("1");
        else
            System.out.println("Otro dia");
        
    }
    //ALICIA ESCALANTE SOSA     No.control: 24550008
}
