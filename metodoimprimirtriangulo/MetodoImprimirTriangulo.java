package com.mycompany.metodoimprimirtriangulo;
import java.util.Scanner;
public class MetodoImprimirTriangulo {

    public static void ImprimirTriangulo(int altura) {
        
        if (altura<=0) {
            System.out.println("Error: Numero menor o igual a cero.");
            return;
        }
        
        for (int posicion=1; posicion<=altura; posicion++) {
            for (int columna=1; columna<=posicion; columna++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la altura del triangulo a imprimir (Debe ser mayor a cero):");
        int altura = scanner.nextInt();
        ImprimirTriangulo(altura);
        scanner.close();
    }
}
