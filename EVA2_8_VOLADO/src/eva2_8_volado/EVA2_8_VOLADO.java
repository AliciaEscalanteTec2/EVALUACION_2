/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_volado;

/**
 *
 * @author Usuario
 */
public class EVA2_8_VOLADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        SE USARA UNA HERRAMIENTA DE JAVA QUE ES UNA LIBRERIA QUE NOS PERMITE
        LANZAR UN NÚMERO ALEATORIO. LA LIBRERIA SE LLAMA "Math."
        aRROJA VALORES ENTRE 0 Y 1
        0.3135343353435
        0.63534353436
        */
        
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de la moneda es = "+moneda);
                
        //0.5 es la mitad del rango 
        if (moneda > 0.5) {
            System.out.println("CARA");
        }else{
            System.out.println("CRUZ");
        }
                
    }
    //ALICIA ESCALANTE SOSA   No.Control: 24550008
    
}
