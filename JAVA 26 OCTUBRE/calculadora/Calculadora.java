package com.mycompany.calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            
            System.out.println("Bienvenido a la calculadora");
            System.out.println("Ingrese la funcion a realizar:");
            System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Salir");
            int opcion = scanner.nextInt();
            
            if (opcion==5) {break;}
            
            System.out.println("Ingrese el primer numero:");
            int numero1 = scanner.nextInt();
            System.out.println("Ingrese el segundo numero:");
            int numero2 = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    int suma = numero1+numero2;
                    System.out.println("La suma de los dos numeros es "+suma);
                    break;
                case 2:
                    int resta = numero1-numero2;
                    System.out.println("La resta de los dos numeros es "+resta);
                    break;
                case 3:
                    int multiplicacion = numero1*numero2;
                    System.out.println("La multiplicacion de los dos numeros es "+multiplicacion);
                    break;
                case 4:
                    if (numero2==0) {
                        System.out.println("Error: Division por cero.");
                    }
                    else {
                        double division = (double) numero1/numero2;
                        System.out.println("La division de los dos numeros es "+division);
                    }
                    break;
                default:
                    System.out.println("Error: Numero fuera del rango especificado.");
                    break;
            }
        } while (true);
        System.out.println("¡Hasta luego!");
        scanner.close();
        
    }
}
