# Primer-Repositorio
Este es mi primer repositorio en GitHub

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public static void main(String[] args)throws ParseException {
    Scanner teclado = new Scanner(System.in);
    
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
    System.out.println("Introduzca la primera fecha: ");
    Date fechaInicial=dateFormat.parse(teclado.nextLine());
    System.out.println("Introduzca la segunda fecha: ");
    Date fechaFinal=dateFormat.parse(teclado.nextLine());
    int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
    System.out.println("Hay "+dias+" dias de diferencia"); 
    
    }