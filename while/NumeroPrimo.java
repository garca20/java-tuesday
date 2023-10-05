package numeroprimo;
import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        System.out.println("Ingrese un número para determinar si es primo o no:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int numeroCreciente = 2;
        if (numero==1) {
            System.out.println("No es primo");
        }
        else {
            String comprobante = "Si";
            while (numeroCreciente<numero) {
                if (numero%numeroCreciente==0) {
                    comprobante = "No";
                    break;
                }
                numeroCreciente += 1;
            }
            System.out.println(comprobante + " es primo.");
        }
    }
}