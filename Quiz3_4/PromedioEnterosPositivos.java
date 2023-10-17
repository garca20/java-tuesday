package promedioenterospositivos;
import java.util.Scanner;

public class PromedioEnterosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero; 
        int sumatoria = 0;
        int contador = 0;
        do {
            System.out.println("Ingrese numeros enteros positivos o un negativo para terminar:" );
            numero = scanner.nextInt();
            if (numero>0) {
                sumatoria += numero;
                contador++;
            }
            else {
                break;
            }
        } while (true);
        double promedio = sumatoria/contador;
        System.out.println("El promedio de los numeros enteros ingresados es: "+promedio);
    }
}
