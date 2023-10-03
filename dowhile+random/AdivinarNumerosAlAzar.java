package adivinarnumerosalazar;
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumerosAlAzar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSistema = random.nextInt(10)+1;
        int numeroUsuario = 0;
        int intentos = 0;
        
        System.out.println("Intenta adivinar el numero del sistema: ");
        do {
            numeroUsuario = scanner.nextInt();
            if (numeroUsuario > numeroSistema) {
                System.out.println("El numero del sistema es menor al ingresado.");
            }
            else {
                System.out.println("El numero del sistema es mayor al ingresado.");
            }
            intentos += 1;
        } while( numeroUsuario!=numeroSistema );
        
        System.out.println("El numero del sistema era " + numeroSistema);
        System.out.println("Utilizaste "+intentos+" intentos.");
        scanner.close();
    }
}
