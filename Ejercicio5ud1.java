package ejercicio5ud1;

import java.util.Scanner;

public class Ejercicio5ud1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int valor1;
        int valor2;
        
        System.out.println("Introduzca valor 1: ");
        valor1 = teclado.nextInt();
        
        System.out.println("Introduzca valor 2: ");
        valor2 = teclado.nextInt();
        
        System.out.println("El mayor de los dos números es " + Math.max(valor1, valor2));
    }
    
}
