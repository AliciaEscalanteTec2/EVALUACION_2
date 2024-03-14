/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_operadores_logicos;

/**
 *
 * @author Usuario
 */
public class EVA2_11_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean siDinero, hayBuenClima; //lima
        
        siDinero = false;
        hayBuenClima = false; 
        
        System.out.println("1. NO HAY DINERO Y NO HAY BUEN CLIMA");
        
        if ((siDinero == true) && (hayBuenClima == true)) {
            System.out.println("Se armó la carnita asadaa, siiiii!!!");
        }else{
            System.out.println("No carnita asada:( ");
        }
                
        siDinero = false;
        hayBuenClima = true; 
        System.out.println();
        System.out.println("2. NO HAY DINERO Y SI HAY BUEN CLIMA");
        
        if ((siDinero == true) && (hayBuenClima == true)) {
            System.out.println("Se armó la carnita asadaa, siiiii!!!");
        }else{
            System.out.println("No carnita asada:( ");
        }
        
        siDinero = true;
        hayBuenClima = false; 
        System.out.println();
        System.out.println("3. SI HAY DINERO Y NO HAY BUEN CLIMA");
        
        if ((siDinero == true) && (hayBuenClima == true)) {
            System.out.println("Se armó la carnita asadaa, siiiii!!!");
        }else{
            System.out.println("No carnita asada:( ");
        }
       
        siDinero = true;
        hayBuenClima = true; 
        System.out.println();
        System.out.println("4. SI HAY DINERO Y SI HAY BUEN CLIMA");
        
        if ((siDinero == true) && (hayBuenClima == true)) {
            System.out.println("Se armo la carnita asadaa, siiiii!!! ");
        }else{
            System.out.println("No carnita asada:( ");
        }
        
    }
    
    //ALICIA ESCALANTE SOSA     No.Control: 24550008
}
