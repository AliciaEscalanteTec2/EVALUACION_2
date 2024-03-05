/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_operadores;

/**
 *
 * @author Usuario
 */
public class EVA2_1_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERADORES ARITMETICOS
        /**
         * SUMA +
         * RESTA -
         * MULTIPLICACIÓN *
         * DIVISIÓN /
         */
        
        //SUMA
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = num1 + num2;  //Operador suma
        //Si en el operador + uno de los términos es una cadena, todo
        // se va a convertir a cadena de texto y se unen, a esto se le llama
        // "Concatenar", que es a unión de cadenas de texto
        System.out.println("La suma es: "+suma);
        System.out.println();
        
        //CONCATENAR
        boolean prueba = true;
        System.out.println("El valor de la prueba es: "+prueba);
        System.out.println();
        
        //MULTIPLICACIÓN
        int multi;
        multi = num1 * num2;
        System.out.println("La multiplicacion es: "+multi);
        System.out.println();
        
        //DIVISIÓN
        int divi = num1 / num2;
        System.out.println("La sivision de 5 / 3 es: "+divi);
        
        double diviDouble = 7 / 2.0; //Se pone con .20 para que nos de 3.5
        System.out.println("La multiplicacion (double) es: "+diviDouble);
        System.out.println();
        System.out.println();
        //ACUMULADORES
        /*
        SUMA +=
        RESTA ==
        MULTI *=
        DIVISION /=
        
        
        int sumatoria = 0;
        sumatoria = sumatoria +90;
        sumatoria = sumatoria + 80;
        sumatoria = sumatoria + 80;
        
        System.out.println("La suma es: "+sumatoria); */
        
        int sumatoria = 0;
        sumatoria += 90; //SUMO
        sumatoria += 80;
        sumatoria += 80;
        System.out.println("La sumatoria es: "+sumatoria);
        
        sumatoria -= 70; //RESTO
        //sumatoria = sumatoria - 70; 
        System.out.println("La sematoria es: "+sumatoria);
        
        int multiAcum = 1;
        multiAcum *=100;
        System.out.println("La multiplicacion es: "+multiAcum);
        multiAcum *=5;
        System.out.println("La multiplicacion es: "+multiAcum);
    }
    
}

//ALICIA ESCALANTE   No.control = 24550008