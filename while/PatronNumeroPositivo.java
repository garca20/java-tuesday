
package patronnumeropositivo;
import java.util.Scanner;

public class PatronNumeroPositivo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int contador = 1;
        
        while (contador<=numero) {
            System.out.print(contador + " ");
            contador += 1;
        }
        
    }
    
}
