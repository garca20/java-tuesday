package factorialdeunentero;
import java.util.Scanner;

public class FactorialDeUnEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un entero positivo: ");
        int enteroPositivo = scanner.nextInt();
        int factorial = 1;
        
        if (enteroPositivo>0) {
            do {
                factorial *= enteroPositivo;
                enteroPositivo -= 1;
            } while (enteroPositivo!=0);
            System.out.println("El factorial de este numero es: " + factorial);
        }
        else {
            System.out.println("Error: El numero entero debe ser mayor a cero.");
        }
        
        scanner.close();
    }
}
