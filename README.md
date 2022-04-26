# Primer-Repositorio
Este es mi primer repositorio en GitHub

import java.time.LocalDate;
import java.util.Scanner;

public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int dia;
    int mes;
    int año;
    System.out.println("Introduce el día de una fecha: ");
    dia = sc.nextInt();
    System.out.println("Introduce el mes de una fecha: ");
    mes = sc.nextInt();
    System.out.println("Introduce el año de una fecha: ");
    año = sc.nextInt();
    
    System.out.println("La fecha introducida es: "+año+"-"+mes+"-"+dia+"\n");
    System.out.println("La fecha dentro de 30 días: " + LocalDate.of(año, mes, dia).plusDays(30));
    System.out.println("La fecha dentro de 60 días: " + LocalDate.of(año, mes, dia).plusDays(60));
    System.out.println("La fecha dentro de 90 días: " + LocalDate.of(año, mes, dia).plusDays(90));
}