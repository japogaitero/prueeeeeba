/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
    int numero;
    int factorial=1, contador = 1;
        
    Scanner teclado = new Scanner(System.in);
    System.out.println ("¿De que número quieres averiguar su factorial?");
    numero=teclado.nextInt();
   
    do{
        factorial = factorial * contador;
        contador++;
    }
    while (contador <= numero);
    System.out.println("el factorial de " + numero + " es " + factorial);
   
    /* con el Loop For también funciona
    for (int i = 1; i <= numero; i++){
        factorial = factorial * i;
    }
    System.out.println("el factorial de " + numero + " es " + factorial);
    */
    }

    
}
