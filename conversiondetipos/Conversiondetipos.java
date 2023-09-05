package conversiondetipos;
import java.util.Scanner;

public class Conversiondetipos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        // Con este método, convertimos integer a string
        String texto = String.valueOf(num);
        System.out.println(texto);
        
        Scanner scanner2 = new Scanner(System.in);
        String textoNumerico = scanner2.nextLine();
        // Con este método, convertimos string a integer
        int integerNum = Integer.parseInt(textoNumerico);
        System.out.println(num + textoNumerico);
        System.out.println(num + integerNum);
        
        
        scanner.close();
        scanner2.close();
    }
}
