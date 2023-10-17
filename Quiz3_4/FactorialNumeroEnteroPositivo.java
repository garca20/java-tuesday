package factorialnumeroenteropositivo;
import java.util.Scanner;

public class FactorialNumeroEnteroPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();
        
        if (numero>0) {
            int factorial = 1;
            for (int contador = numero; contador > 1; contador--) {
                factorial *= contador;
            }
            System.out.println(factorial);
        }
        else {
            System.out.println("Error: Solo se admiten numeros positivos.");
        }
        
    }
    
}
