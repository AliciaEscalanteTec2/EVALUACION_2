/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
                                INSTRUCCIONES: 
        Vamos a declarar 2 variables: un acceso por usuario y contraseña
        */
        
        String usuario, pwd;
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
        
        Scanner captu = new Scanner(System.in);
        
        /*
        Como es control de acceso, debemos preguntar un número indeterminado
        de veces, hasta que el usuario y contraseña sean correctos
        */
        while (true){
            System.out.println("Usuario: ");
            usuario = captu.nextLine();
            System.out.println("Contraseña: ");
            pwd = captu.nextLine();
            if (usuario.equals(USUARIO) && pwd.equals(PASSWORD)) {
                break; //rompe el ciclo 
            }else{
                System.out.println("DATOS INCORRECTOS");
            }
        }
        
        System.out.println("BIENVENIDO AL SISTEMA!!!");
        
    }
             // ALICIA ESCALANTE SOSA    No.control = 24550008
}
