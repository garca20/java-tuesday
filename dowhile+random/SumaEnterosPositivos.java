package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int almacenador = 0;
        int numeroPositivo = 0;
               
        do {
          almacenador += numeroPositivo;
          System.out.println("Ingrese un numero entero positivo:");
          numeroPositivo = scanner.nextInt();
        } while (numeroPositivo>0);
        
        System.out.println("La suma de todos los numeros enteros positivos es: "+almacenador);
        scanner.close();
    }
}
