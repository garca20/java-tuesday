package numeroacadenaysumarcon5;
import java.util.Scanner;

public class NumeroACadenaYSumarCon5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numeroEntero = scanner.nextInt();
        String cadenaNumeroEntero = String.valueOf(numeroEntero);
        int numeroCadenaNumeroEntero = Integer.parseInt(cadenaNumeroEntero);
        System.out.println("El numero a cadena es: " + cadenaNumeroEntero);
        System.out.println("La cadena mas 5 es: " + (numeroCadenaNumeroEntero+5));
        scanner.close();
    }
}
